package org.example;

public class Eletronico extends Produto {
    private String marca;

    public Eletronico(String nome, double preco, boolean disponivel, String marca) {
        super(nome, preco, disponivel);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public void detalhesProduto() {
        System.out.println("Eletrônico: " + getNome() + ", Marca: " + marca + ", Preço: " + getPreco());
    }
}
