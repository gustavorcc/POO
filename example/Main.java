package org.example;

public class Main {
    public static void main(String[] args) {
        Produto livro1 = new Livro("Java Programming", 50.0, true, "James Gosling");
        Produto eletronico1 = new Eletronico("Smartphone", 2000.0, true, "Samsung");

        livro1.detalhesProduto();
        eletronico1.detalhesProduto();
    }
}