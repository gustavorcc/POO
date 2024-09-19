package com.exercices;

import java.time.LocalDate;
public class Professor extends Pessoa
{
    public Professor(String nome, LocalDate nascimento, char sexo) {
        super(nome, nascimento, sexo);
        this.setEmprestimoMax(5);
    }

    @Override
    public void reservar(Midia midia){
        if (this.getEmprestimosAtual() < this.getEmprestimoMax()){
            this.setEmprestimosAtual(this.getEmprestimosAtual() + 1);
            super.reservar(midia);
        } else {
            System.out.println("Esse professor execedeu o limite de empréstimos simultâneos!");
        }
    }
}
