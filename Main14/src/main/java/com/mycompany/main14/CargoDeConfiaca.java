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
public class CargoDeConfiaca extends Funcionario{
    
    protected Bonificacao bonificacao;

    public CargoDeConfiaca(Bonificacao bonificacao, String nome, String CPF, String RG, Genero genero, double SalarioBase, LocalDate dataAdmissao) {
        super(nome, CPF, RG, genero, SalarioBase, dataAdmissao);
        this.bonificacao = bonificacao;
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }
    
     @Override
    public double getSalarioFinal() {
     double SalarioFinal = 0;
     SalarioFinal += SalarioFinal;
      return SalarioFinal;
    }
    
    
}
