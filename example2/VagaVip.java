package org.example;

class VagaVIP extends Vaga {
    public VagaVIP() {
        super("VIP");
    }

    @Override
    public double calcularTarifa(long tempoPermanencia) {
        // R$ 5 por hora
        return (tempoPermanencia / 3600000) * 5.0;
    }
}