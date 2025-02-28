package org.example;

class Caminhao extends Veiculo {
    public int capacidadeCarga;
    public int tanque;
    public float consumo;

    public Caminhao(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, int capacidadeCarga, int tanque, float consumo) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        this.capacidadeCarga = capacidadeCarga;
        this.tanque = tanque;
        this.consumo = consumo;
    }

    @Override
    public float calcularAutonomia() {
        float ajusteCarga = (capacidadeCarga >= 0 && capacidadeCarga <= 25) ? (capacidadeCarga / 100.0f) : (25 / 100.0f);
        return tanque / (consumo - ajusteCarga);
    }
}
