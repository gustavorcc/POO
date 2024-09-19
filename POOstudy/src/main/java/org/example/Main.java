// Classe Base: Vaga
public abstract class Vaga {
    private String idVaga;
    private boolean ocupada;
    private long tempoEntrada;

    public Vaga(String idVaga) {
        this.idVaga = idVaga;
        this.ocupada = false;
    }

    public String getIdVaga() {
        return idVaga;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void registrarEntrada(long tempoEntrada) {
        this.tempoEntrada = tempoEntrada;
        this.ocupada = true;
    }

    public long calcularTempoPermanencia(long tempoSaida) {
        return tempoSaida - tempoEntrada;
    }

    public void registrarSaida() {
        this.ocupada = false;
        this.tempoEntrada = 0;
    }

    public abstract double calcularTarifa(long tempoPermanencia);
}

// Vaga Regular
public class VagaRegular extends Vaga {
    private static final double TARIFA_POR_HORA = 10.0;

    public VagaRegular(String idVaga) {
        super(idVaga);
    }

    @Override
    public double calcularTarifa(long tempoPermanencia) {
        return (tempoPermanencia / 3600000) * TARIFA_POR_HORA; // tempo em milissegundos para horas
    }
}

// Vaga VIP
public class VagaVip extends Vaga {
    private static final double TARIFA_POR_HORA = 5.0;

    public VagaVip(String idVaga) {
        super(idVaga);
    }

    @Override
    public double calcularTarifa(long tempoPermanencia) {
        return (tempoPermanencia / 3600000) * TARIFA_POR_HORA;
    }
}

// Vaga para Veículos Elétricos
public class VagaEletrica extends Vaga {
    private static final double TARIFA_POR_HORA = 12.0;
    private static final double TARIFA_CARREGADOR = 5.0;

    public VagaEletrica(String idVaga) {
        super(idVaga);
    }

    @Override
    public double calcularTarifa(long tempoPermanencia) {
        return (tempoPermanencia / 3600000) * TARIFA_POR_HORA + TARIFA_CARREGADOR;
    }
}

// Vaga para Deficientes
public class VagaDeficiente extends Vaga {
    public VagaDeficiente(String idVaga) {
        super(idVaga);
    }

    @Override
    public double calcularTarifa(long tempoPermanencia) {
        return 0.0; // Gratuito
    }
}

// Cliente VIP
public class ClienteVip {
    private String nome;
    private boolean fidelidadeAtiva;

    public ClienteVip(String nome, boolean fidelidadeAtiva) {
        this.nome = nome;
        this.fidelidadeAtiva = fidelidadeAtiva;
    }

    public boolean podeReservar() {
        return fidelidadeAtiva;
    }
}

// Classe Principal: SistemaEstacionamento
import java.util.ArrayList;
import java.util.List;

public class SistemaEstacionamento {
    public static void main(String[] args) {
        List<Vaga> vagas = new ArrayList<>();
        vagas.add(new VagaRegular("R1"));
        vagas.add(new VagaVip("V1"));
        vagas.add(new VagaEletrica("E1"));
        vagas.add(new VagaDeficiente("D1"));

        ClienteVip clienteVip = new ClienteVip("João", true);

        // Registrar a entrada de um veículo VIP
        if (clienteVip.podeReservar()) {
            Vaga vagaVip = vagas.get(1); // Vaga VIP
            if (!vagaVip.isOcupada()) {
                vagaVip.registrarEntrada(System.currentTimeMillis());
                System.out.println("Vaga VIP reservada e veículo entrou.");
            }
        }

        // Simular saída e calcular tarifa
        long tempoSaida = System.currentTimeMillis() + 2 * 3600 * 1000; // 2 horas depois
        Vaga vaga = vagas.get(1); // Vaga VIP
        long tempoPermanencia = vaga.calcularTempoPermanencia(tempoSaida);
        double tarifa = vaga.calcularTarifa(tempoPermanencia);

        System.out.println("Tempo de permanência: " + (tempoPermanencia / 1000 / 60) + " minutos.");
        System.out.println("Tarifa total: R$" + tarifa);
    }
}
