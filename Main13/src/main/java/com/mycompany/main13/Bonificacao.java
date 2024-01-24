/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.main13;

/**
 *
 * @author Ana Beatriz
 */
public enum Bonificacao {
    
    GERENTE(0.2),
    DIRETOR(0.4);
    
    
    private final double valor;

    private Bonificacao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
