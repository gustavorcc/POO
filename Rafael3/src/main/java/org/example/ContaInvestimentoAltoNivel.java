package org.example;

public class ContaInvestimentoAltoNivel extends ContaInvestimento {
    public ContaInvestimentoAltoNivel(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        if (valor < 10000) {
            System.out.println("Valor mínimo para saque é R$10.000.");
            return;
        }

        double taxa = valor * 0.05;
        double total = valor + taxa;

        if (total > saldo) {
            System.out.println("Saldo insuficiente para saque.");
        } else {
            saldo -= total;
            System.out.println("Saque de R$" + valor + " realizado com taxa de R$" + taxa);
        }
    }
}