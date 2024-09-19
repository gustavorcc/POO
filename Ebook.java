package com.exercices;

public class Ebook extends Midia
{
    public Ebook(String titulo, String autor, String genero, boolean disponivel) {
        super(titulo, autor, genero, disponivel);
        this.setTempoMax(21);
    }
}
