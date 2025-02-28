package org.example;

public class Veiculo {
    public String marca;
    public String modelo;
    public int ano;
    public int capacidadePassageiros;
    public String combustivel;

    public Veiculo(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.capacidadePassageiros = capacidadePassageiros;
        this.combustivel = combustivel;
    }

    public float calcularAutonomia() {
        return 0.0f;
    }

    public void exibirDetalhes() {
        System.out.println("Veículo: " + modelo);
    }
}