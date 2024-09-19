package com.exercices;

public class Dvd extends Midia
{
    public Dvd(String titulo, String autor, String genero, boolean disponivel) {
        super(titulo, autor, genero, disponivel);
        this.setTempoMax(7);
    }
}
