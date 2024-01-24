/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main14;

import java.time.LocalDate;

/**
 *
 * @author Ana Beatriz
 */
public class Diretor extends CargoDeConfiaca{

   private double PREMIO = 0.1; 

    public Diretor(Bonificacao bonificacao, String nome, String CPF, String RG, Genero genero, double SalarioBase, LocalDate dataAdmissao) {
        super(bonificacao, nome, CPF, RG, genero, SalarioBase, dataAdmissao);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public double getSalarioFinal() {
      double SalarioFinal = 0;
      SalarioFinal += SalarioBase * PREMIO;
      SalarioFinal += SalarioBase * bonificacao.getValor();
      return SalarioFinal;
    }

    @Override
    public String toString() {
        return super.toString() +  "PREMIO:" + PREMIO;
    }
    
    
   
   
    
}
