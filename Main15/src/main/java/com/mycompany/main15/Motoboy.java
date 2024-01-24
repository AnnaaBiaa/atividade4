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
public class Motoboy extends Funcionario{
    
    private String carteiradeHabilitacao;

    public Motoboy(String carteiradeHabilitacao, String nome, Genero genero, double SalarioBase, LocalDate dataNasc, Setor setor) {
        super(nome, genero, SalarioBase, dataNasc, setor);
        this.carteiradeHabilitacao = carteiradeHabilitacao;
    }

    public String getCarteiradeHabilitacao() {
        return carteiradeHabilitacao;
    }

    public void setCarteiradeHabilitacao(String carteiradeHabilitacao) {
        this.carteiradeHabilitacao = carteiradeHabilitacao;
    }

    @Override
    public double getSalarioFinal() {
     double SalarioFinal = 0;
     SalarioFinal += getSalarioBase();
      return SalarioFinal;
    }

    @Override
    public String toString() {
        return super.toString() + "\ncarteiradeHabilitacao:" + carteiradeHabilitacao;
    }
    
    
    
    
}
