/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main15;

import java.time.LocalDate;

/**
 *
 * @author Ana Beatriz
 */
public class Diretor extends Funcionario implements Contratacao{
    
    private double PREMIO = 0.2;

    public Diretor(String nome, Genero genero, double SalarioBase, LocalDate dataNasc, Setor setor) {
        super(nome, genero, SalarioBase, dataNasc, setor);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    public void setPREMIO(double PREMIO) {
        this.PREMIO = PREMIO;
    }

    @Override
    public double getSalarioFinal() {
     double SalarioFinal = 0;
     SalarioFinal += getSalarioBase();
      return SalarioFinal;
    }

    @Override
    public String toString() {
        return super.toString() + "PREMIO:" + PREMIO;
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Dados do funcionário Admitido" + funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Dados do funcionário demitido" + funcionario.toString());
    }
 
    
}
