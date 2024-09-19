package org.example;

// Classe abstrata Produto
abstract class Produto {
    protected String nome;
    protected double preco;
    protected int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public abstract double calcularDesconto(); // Varia conforme o tipo de produto

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void exibirDetalhes() {
        System.out.println("Produto: " + nome + ", Preço: R$ " + preco + ", Estoque: " + estoque + " unidades");
    }
}

// Classe Eletronico
class Eletronico extends Produto {
    public Eletronico(String nome, double preco, int estoque) {
        super(nome, preco, estoque);
    }

    @Override
    public double calcularDesconto() {
        return preco * 0.9; // 10% de desconto para produtos eletrônicos
    }
}

// Classe Vestuario
class Vestuario extends Produto {
    public Vestuario(String nome, double preco, int estoque) {
        super(nome, preco, estoque);
    }

    @Override
    public double calcularDesconto() {
        return preco * 0.8; // 20% de desconto para produtos de vestuário
    }
}

// Classe Alimento
class Alimento extends Produto {
    public Alimento(String nome, double preco, int estoque) {
        super(nome, preco, estoque);
    }

    @Override
    public double calcularDesconto() {
        return preco; // Sem desconto para alimentos
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

// Classe Loja
class Loja {
    private Produto[] produtos;
    private int totalProdutos = 5;

    public Loja() {
        produtos = new Produto[totalProdutos];
        // Adicionando alguns produtos à loja
        produtos[0] = new Eletronico("Smartphone", 2000.0, 10);
        produtos[1] = new Vestuario("Camiseta", 50.0, 20);
        produtos[2] = new Alimento("Arroz", 10.0, 100);
    }

    public void listarProdutos() {
        System.out.println("Lista de produtos disponíveis:");
        for (Produto produto : produtos) {
            if (produto != null && produto.getEstoque() > 0) {
                produto.exibirDetalhes();
            }
        }
    }

    public void comprarProduto(int indice, Cliente cliente) {
        if (indice >= 0 && indice < produtos.length && produtos[indice].getEstoque() > 0) {
            double precoFinal = produtos[indice].calcularDesconto();
            if (cliente.isVip()) {
                precoFinal *= 0.9; // 10% de desconto adicional para clientes VIP
            }
            System.out.println(cliente.getNome() + " comprou " + produtos[indice].getNome() + " por R$ " + precoFinal);
            produtos[indice].setEstoque(produtos[indice].getEstoque() - 1);
        } else {
            System.out.println("Produto não disponível ou índice inválido.");
        }
    }
}

// Classe Main para testar o sistema
public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();
        Cliente clienteRegular = new Cliente("João", false);
        Cliente clienteVIP = new Cliente("Maria", true);

        // Listar produtos disponíveis
        loja.listarProdutos();

        // Cliente regular comprando o primeiro produto (Eletrônico)
        loja.comprarProduto(0, clienteRegular);

        // Cliente VIP comprando o segundo produto (Vestuário)
        loja.comprarProduto(1, clienteVIP);
    }
}
