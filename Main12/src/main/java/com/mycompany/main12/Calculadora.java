/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main12;

/**
 *
 * @author Ana Beatriz
 */
// Soma.java
public class Calculadora implements OperacaoMatematica {
    
    public String calcular(String a, String b) {
        return a + b;
    }
    
    public  int calcular (int a, int b) {
        return a - b;
    }  
     public double calcular(double  a, double b){
        return a / b;
    }  
     
     public float calcular(float a, float b) {
        return a * b;
    }  
    
    
}
