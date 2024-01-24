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
public class Motoboy extends Funcionario{
    
    private String placaMoto;

    public Motoboy(String placaMoto, String nome, String CPF, String RG, Genero genero, double SalarioBase, LocalDate dataAdmissao) {
        super(nome, CPF, RG, genero, SalarioBase, dataAdmissao);
        this.placaMoto = placaMoto;
    }

    public String getPlacaMoto() {
        return placaMoto;
    }

    public void setPlacaMoto(String placaMoto) {
        this.placaMoto = placaMoto;
    }

    @Override
    public double getSalarioFinal() {
     double SalarioFinal = 0;
     SalarioFinal += getSalarioBase();
     return SalarioFinal;
    }
   
    @Override
    public String toString() {
        return super.toString() + "\nplacaMoto:" + placaMoto;
    }

    
    
    
    
}
