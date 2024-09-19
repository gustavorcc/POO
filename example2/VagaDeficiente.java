package org.example;

class VagaDeficiente extends Vaga {
    public VagaDeficiente() {
        super("Deficiente");
    }

    @Override
    public double calcularTarifa(long tempoPermanencia) {
        // Gratuito
        return 0.0;
    }
}