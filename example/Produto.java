package org.example;

public class Produto {
    private String nome;
    private double preco;
    private boolean disponivel;

    public Produto(String nome, double preco, boolean disponivel) {
        this.nome = nome;
        this.preco = preco;
        this.disponivel = disponivel;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void detalhesProduto() {
        System.out.println("Produto: " + nome + ", Preço: " + preco);
    }
}

