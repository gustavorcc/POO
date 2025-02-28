package org.example;

class Onibus extends Veiculo {
    public int quantidadeEixos;
    public int tanque;
    public int consumo;

    public Onibus(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, int quantidadeEixos, int tanque, int consumo) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        this.quantidadeEixos = quantidadeEixos;
        this.tanque = tanque;
        this.consumo = consumo;
    }

    @Override
    public float calcularAutonomia() {
        return tanque / (float) consumo;
    }
}