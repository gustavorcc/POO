package org.example;

class CarroEletrico extends Carro {
    public int bateriaKWh;

    public CarroEletrico(String marca, String modelo, int ano, int capacidadePassageiros, int bateriaKWh) {
        super(marca, modelo, ano, capacidadePassageiros, "Elétrico movido a bateria");
        this.bateriaKWh = bateriaKWh;
    }

    @Override
    public float calcularAutonomia() {
        return bateriaKWh * 5;
    }
}