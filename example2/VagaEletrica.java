package org.example;

class VagaEletrica extends Vaga {
    private double tarifaCarregador = 20.0; // Tarifa adicional para o uso do carregador

    public VagaEletrica() {
        super("Veículo Elétrico");
    }

    @Override
    public double calcularTarifa(long tempoPermanencia) {
        // R$ 12 por hora + tarifa adicional
        return (tempoPermanencia / 3600000) * 12.0 + tarifaCarregador;
    }
}