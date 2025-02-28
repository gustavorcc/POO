package org.example;

public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Impossível realizar saque: saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        }
    }
}