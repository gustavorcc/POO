package org.example;

public class Main {
    public static void main(String[] args) {

        ContaPoupanca contaPoupanca = new ContaPoupanca(77777, "Cristiano Ronaldo", 3500);
        ContaInvestimento contaInvestimento = new ContaInvestimento(33333, "Elon Musk", 100000);
        ContaInvestimentoAltoNivel contaAltoNivel = new ContaInvestimentoAltoNivel(11111, "Neymar", 500000);


        System.out.println(">>>>Informações Iniciais<<<<");
        contaPoupanca.exibirInformacoes();
        contaInvestimento.exibirInformacoes();
        contaAltoNivel.exibirInformacoes();


        System.out.println("\n>>> Cristiano Ronaldo deposita R$ 5000 na Poupança.");
        contaPoupanca.depositar(5000);
        contaPoupanca.exibirInformacoes();


        System.out.println("\n>>> Elon Musk saca R$ 10000 da Conta Investimento.");
        contaInvestimento.sacar(10000);
        contaInvestimento.exibirInformacoes();


        System.out.println("\n>>> Neymar tenta sacar R$ 8000 da Conta Alto Nível.");
        contaAltoNivel.sacar(8000);
        System.out.println("\n>>> Neymar saca R$ 50.000 da Conta Alto Nível.");
        contaAltoNivel.sacar(50000);
        contaAltoNivel.exibirInformacoes();
    }
}