/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main13;

import java.time.LocalDate;

/**
 *
 * @author Ana Beatriz
 */
public class Gerente extends CargoDeConfiança implements Autenticavel{

    public Gerente(Bonificacao bonificacao, String nome, String CPF, String RG, Genero genero, double SalarioBase, LocalDate dataAdmissao) {
        super(bonificacao, nome, CPF, RG, genero, SalarioBase, dataAdmissao);
    }

    @Override
    public double getSalarioFinal() {
     double SalarioFinal = 0;
     SalarioFinal += SalarioBase * bonificacao.getValor();
      return SalarioFinal;
    }

    
    @Override
    public String toString() {
        return super.toString();
    }
    
}
