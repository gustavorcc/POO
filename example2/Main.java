package org.example;
public class Main {
    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento();
        Cliente clienteRegular = new Cliente("João", false);
        Cliente clienteVIP = new Cliente("Maria", true);


        estacionamento.registrarEntrada(1, clienteRegular);


        estacionamento.registrarEntrada(1, clienteVIP);


        estacionamento.registrarSaida(1, 7200000); // 2 horas
    }
}