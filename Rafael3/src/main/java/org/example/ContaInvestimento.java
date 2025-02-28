package org.example;

public class ContaInvestimento extends ContaBancaria {
    public ContaInvestimento(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        double taxa = valor * 0.02;
        double total = valor + taxa;

        if (total > saldo) {
            System.out.println("Saldo insuficiente para fazer o saque.");
        } else {
            saldo -= total;
            System.out.println("Saque de R$" + valor + " realizado com taxa de R$" + taxa);
        }
    }
}