// Classe abstrata Filme
abstract class Filme {
    protected String titulo;
    protected String genero;
    protected int duracao; // em minutos
    protected boolean disponivel;

    public Filme(String titulo, String genero, int duracao, boolean disponivel) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
        this.disponivel = disponivel;
    }

    public abstract double calcularPrecoIngresso(); // Preço do ingresso varia conforme o tipo de filme

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo + ", Gênero: " + genero + ", Duração: " + duracao + " minutos");
    }
}

// Classe Filme2D
class Filme2D extends Filme {
    public Filme2D(String titulo, String genero, int duracao, boolean disponivel) {
        super(titulo, genero, duracao, disponivel);
    }

    @Override
    public double calcularPrecoIngresso() {
        return 20.0; // Ingresso de filme 2D custa R$ 20,00
    }
}

// Classe Filme3D
class Filme3D extends Filme {
    public Filme3D(String titulo, String genero, int duracao, boolean disponivel) {
        super(titulo, genero, duracao, disponivel);
    }

    @Override
    public double calcularPrecoIngresso() {
        return 30.0; // Ingresso de filme 3D custa R$ 30,00
    }
}

// Classe FilmeIMAX
class FilmeIMAX extends Filme {
    public FilmeIMAX(String titulo, String genero, int duracao, boolean disponivel) {
        super(titulo, genero, duracao, disponivel);
    }

    @Override
    public double calcularPrecoIngresso() {
        return 40.0; // Ingresso de filme IMAX custa R$ 40,00
    }
}

// Classe Cliente
class Cliente {
    private String nome;
    private boolean vip;

    public Cliente(String nome, boolean vip) {
        this.nome = nome;
        this.vip = vip;
    }

    public boolean isVip() {
        return vip;
    }

    public String getNome() {
        return nome;
    }
}

// Classe Cinema
class Cinema {
    private Filme[] filmes;
    private int totalFilmes = 5;

    public Cinema() {
        filmes = new Filme[totalFilmes];
        // Adicionando alguns filmes ao cinema
        filmes[0] = new Filme2D("Ação Explosiva", "Ação", 120, true);
        filmes[1] = new Filme3D("Mundo Fantástico", "Fantasia", 140, true);
        filmes[2] = new FilmeIMAX("Aventura Espacial", "Ficção Científica", 180, true);
    }

    public void listarFilmes() {
        System.out.println("Lista de filmes disponíveis:");
        for (Filme filme : filmes) {
            if (filme != null && filme.isDisponivel()) {
                filme.exibirDetalhes();
            }
        }
    }

    public void comprarIngresso(int indice, Cliente cliente) {
        if (indice >= 0 && indice < filmes.length && filmes[indice].isDisponivel()) {
            double precoIngresso = filmes[indice].calcularPrecoIngresso();
            if (cliente.isVip()) {
                precoIngresso *= 0.8; // 20% de desconto para clientes VIP
            }
            System.out.println("Ingresso para " + filmes[indice].getTitulo() + " comprado. Preço: R$ " + precoIngresso);
        } else {
            System.out.println("Filme não disponível ou índice inválido.");
        }
    }
}

// Classe Main para testar o sistema
public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        Cliente clienteRegular = new Cliente("João", false);
        Cliente clienteVIP = new Cliente("Maria", true);

        // Listar filmes disponíveis
        cinema.listarFilmes();

        // Cliente regular comprando ingresso para o primeiro filme (2D)
        cinema.comprarIngresso(0, clienteRegular);

        // Cliente VIP comprando ingresso para o segundo filme (3D)
        cinema.comprarIngresso(1, clienteVIP);
    }
}
