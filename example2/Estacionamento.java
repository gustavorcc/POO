package org.example;

class Estacionamento {
    private Vaga[] vagas;
    private int totalVagas = 10;

    public Estacionamento() {
        vagas = new Vaga[totalVagas];

        vagas[0] = new VagaRegular();
        vagas[1] = new VagaVIP();
        vagas[2] = new VagaEletrica();
        vagas[3] = new VagaDeficiente();
    }
    public void registrarEntrada(int indice, Cliente cliente) {
        if (indice >= 0 && indice < vagas.length) {
            if (vagas[indice] instanceof VagaVIP && !cliente.isVip()) {
                System.out.println("Acesso negado: Vaga VIP reservada para clientes VIP.");
            } else {
                vagas[indice].ocupar();
            }
        }
    }

    public void registrarSaida(int indice, long tempoPermanencia) {
        if (indice >= 0 && indice < vagas.length && vagas[indice].isOcupada()) {
            double tarifa = vagas[indice].calcularTarifa(tempoPermanencia);
            vagas[indice].liberar();
            System.out.println("Tarifa a pagar: R$ " + tarifa);
        }
    }
}