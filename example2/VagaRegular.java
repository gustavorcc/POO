package org.example;

class VagaRegular extends Vaga {
    public VagaRegular() {
        super("Regular");
    }

    @Override
    public double calcularTarifa(long tempoPermanencia) {
        // R$ 10 por hora
        return (tempoPermanencia / 3600000) * 10.0;
    }
}
