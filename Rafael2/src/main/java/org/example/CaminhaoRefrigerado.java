package org.example;

class CaminhaoRefrigerado extends Caminhao {
    public float temperaturaMinima;

    public CaminhaoRefrigerado(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, int capacidadeCarga, int tanque, float consumo, float temperaturaMinima) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel, capacidadeCarga, tanque, consumo);
        this.temperaturaMinima = temperaturaMinima;
    }

    @Override
    public float calcularAutonomia() {
        return super.calcularAutonomia() * 0.9f; // Reduz autonomia em 10%
    }
}