package com.exercices;

import java.time.LocalDate;

public class Pessoa
{
    private String nome;
    private LocalDate nascimento;
    private char sexo;
    private int emprestimoMax;
    private int emprestimosAtual=0;
    private boolean fidelidade;
    private boolean podeEmprestar;

    public Pessoa(String nome, LocalDate nascimento, char sexo) {
        this.nascimento = nascimento;
        this.sexo = sexo;
        this.nome = nome;
    }

    public void reservar(Midia midia){
        if(midia.isDisponivel()){
            midia.setDisponivel(false);
            midia.setReservador(this);
            System.out.println("Reservado com sucesso!");
        } else {
            Pessoa dono = midia.getReservador();
            System.out.println("Erro na reserva! "+ dono.getNome() + " já reservou esta mídia!");
        }
    }

    public void devolver(Midia midia){
        if(this == midia.getReservador()){
            midia.setDisponivel(true);
            midia.setReservador(null);
            System.out.println("Devolvido com sucesso!");
        } else {
            System.out.println("Você não reservou essa mídia!");
        }
    }

    public int getEmprestimosAtual() {
        return emprestimosAtual;
    }

    public void setEmprestimosAtual(int emprestimosAtual) {
        this.emprestimosAtual = emprestimosAtual;
    }

    public boolean isFidelidade() {
        return fidelidade;
    }

    public void setFidelidade(boolean fidelidade) {
        this.fidelidade = fidelidade;

        if(fidelidade) this.emprestimoMax = this.emprestimoMax+1;
        else this.emprestimoMax = this.emprestimoMax-1;
    }

    public boolean podeEmprestar() {
        return podeEmprestar;
    }

    public int getEmprestimoMax() {
        return emprestimoMax;
    }

    public void setEmprestimoMax(int emprestimoMax) {
        this.emprestimoMax = emprestimoMax;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
