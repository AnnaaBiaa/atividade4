/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main14;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Ana Beatriz
 */
public class Main14 {

    public static void main(String[] args) {
       
        Motoboy moto = new Motoboy("6272abc", "João", "7262892", "8272628", Genero.MASCULINO, 1.500, LocalDate.of(2021, Month.MARCH, 23));
        Gerente gerente = new Gerente(Bonificacao.GERENTE, "Luisa", "627162", "289271982", Genero.FEMININO, 1.500, LocalDate.of(2018, Month.MAY, 5));
        Diretor diretor = new Diretor(Bonificacao.DIRETOR, "Marcos", "6278229", "6282781", Genero.MASCULINO, 1.500, LocalDate.of(2022, Month.JANUARY, 9));
        
        
        System.out.println(moto.toString());
        System.out.println(gerente.toString());
        System.out.println(diretor.toString());
    }
}
