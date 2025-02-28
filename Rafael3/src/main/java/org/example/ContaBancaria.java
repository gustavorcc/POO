package org.example;

abstract class ContaBancaria {
    protected int numeroConta;
    protected String titular;
    protected double saldo;

    public ContaBancaria(int numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public abstract void sacar(double valor);

    public void exibirInformacoes() {
        System.out.println("\nNúmero da conta: " + numeroConta);
        System.out.println("Nome do titular: " + titular);
        System.out.println("Saldo da conta: R$" + saldo);
    }
}
