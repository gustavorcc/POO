package com.exercices;

public class Livro extends Midia
{
    public Livro(String titulo, String autor, String genero, boolean disponivel) {
        super(titulo, autor, genero, disponivel);
        this.setTempoMax(14);
    }
}
