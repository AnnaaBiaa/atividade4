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
public abstract class Funcionario implements SalarioFinal{
    
   protected String nome;
   protected Genero genero;
   protected double SalarioBase;
   protected LocalDate dataNasc;
   protected Setor setor;

    public Funcionario(String nome, Genero genero, double SalarioBase, LocalDate dataNasc, Setor setor) {
        this.nome = nome;
        this.genero = genero;
        this.SalarioBase = SalarioBase;
        this.dataNasc = dataNasc;
        this.setor = setor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(double SalarioBase) {
        this.SalarioBase = SalarioBase;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        return  "\nnome:" + nome + 
                "\ngenero:" + genero + "\nSalarioBase:" + SalarioBase + 
                "\ndataNasc:" + dataNasc + "\nsetor:" + setor;
    }
   
   
    
}
