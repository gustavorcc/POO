package com.exercices;

import java.time.LocalDate;

public class Aluno extends Pessoa
{
    public Aluno(String nome, LocalDate nascimento, char sexo) {
        super(nome, nascimento, sexo);
        this.setEmprestimoMax(3);
    }

    @Override
    public void reservar(Midia midia){
        if (this.getEmprestimosAtual() < this.getEmprestimoMax()){
            this.setEmprestimosAtual(getEmprestimosAtual() + 1);
            super.reservar(midia);
        } else {
            System.out.println("Este aluno já execedeu o máximo de empréstimos simultâneos!");
        }
    }
}
