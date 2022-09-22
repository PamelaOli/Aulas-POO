/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pessoas;

/**
 *
 * @author CEITELABINFO
 */
public abstract class Pessoa {
    
     private String nome;
     private String endereco;
     private double rendimentos;
     
     public Pessoa() {
         
     }
     
     public Pessoa(String nome, String endereco, double rend) {
         this.nome = nome;
         this.endereco = endereco;
         this.rendimentos = rend;
     }
     
     public double calcularImposto() {
         return 0.0;
     }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getRendimentos() {
        return rendimentos;
    }

    public void setRendimentos(double rendimentos) {
        this.rendimentos = rendimentos;
    }
     
     
    
}
