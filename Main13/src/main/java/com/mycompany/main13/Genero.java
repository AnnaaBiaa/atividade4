/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.main13;

/**
 *
 * @author Ana Beatriz
 */
public enum Genero {
    
    FEMININO ("feminino"),
    MASCULINO("masculino");
    
    private String texto;

    private Genero(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
   
}
