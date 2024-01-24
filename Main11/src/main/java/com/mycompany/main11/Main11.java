/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main11;

/**
 *
 * @author Ana Beatriz
 */
public class Main11 {

    public static void main(String[] args) {
        
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        Animal galo = new Galo();
        Animal pato = new Pato();
        
        System.out.println("\nCachorro:" + cachorro.EmitirSom()); 
        System.out.println(cachorro.Comer());
        
        System.out.println("\nGato:" + gato.EmitirSom());
        System.out.println(gato.Comer());
        
        System.out.println("\nGalo:" + galo.EmitirSom());
        System.out.println(galo.Comer());
        System.out.println("\nPato:" + pato.EmitirSom());
        System.out.println(pato.Comer());
    }
}
