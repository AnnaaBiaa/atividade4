/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main15;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Ana Beatriz
 */
public class Main15 {

    public static void main(String[] args) {
       Diretor diretor = new Diretor("Luis", Genero.MASCULINO, 1.500, LocalDate.of(2019, Month.MARCH, 8), Setor.OPERACOES);
       Motoboy moto = new Motoboy("63633", "Luisa", Genero.FEMININO, 1.500, LocalDate.of(2022, Month.MARCH, 7), Setor.OPERACOES);
       
       diretor.admitir(moto);
        
    }
}
