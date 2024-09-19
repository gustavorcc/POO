package com.exercices;

public class Midia
{
    private String titulo;
    private String autor;
    private int tempoMax;
    private String genero;
    private boolean disponivel;
    private Pessoa reservador;

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public Pessoa getReservador() {
        return reservador;
    }

    public void setReservador(Pessoa reservador) {
        this.reservador = reservador;
    }

    public int getTempoMax() {
        return tempoMax;
    }

    public void setTempoMax(int tempoMax) {
        this.tempoMax = tempoMax;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Midia (String titulo, String autor, String genero, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.disponivel = disponivel;
    }
}
