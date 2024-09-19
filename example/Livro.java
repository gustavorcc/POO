package org.example;

public class Livro extends Produto {
    private String autor;

    public Livro(String nome, double preco, boolean disponivel, String autor) {
        super(nome, preco, disponivel);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public void detalhesProduto() {
        System.out.println("Livro: " + getNome() + ", Autor: " + autor + ", Preço: " + getPreco());
    }
}
