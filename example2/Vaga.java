package org.example;

abstract class Vaga {
    protected String tipo;
    protected boolean ocupada;

    public Vaga(String tipo) {
        this.tipo = tipo;
        this.ocupada = false;
    }

    public abstract double calcularTarifa(long tempoPermanencia); // tempoPermanencia em milissegundos

    public void ocupar() {
        if (!ocupada) {
            ocupada = true;
            System.out.println("Vaga " + tipo + " ocupada.");
        } else {
            System.out.println("Vaga já está ocupada.");
        }
    }

    public void liberar() {
        if (ocupada) {
            ocupada = false;
            System.out.println("Vaga " + tipo + " liberada.");
        } else {
            System.out.println("Vaga já está liberada.");
        }
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public String getTipo() {
        return tipo;
    }
}