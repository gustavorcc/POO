package org.example;

class Carro extends Veiculo {
    public String tipoCarro;
    public int tanque = 50;
    public float consumo = 12;

    public Carro(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
    }

    @Override
    public float calcularAutonomia() {
        return tanque / consumo;
    }
}