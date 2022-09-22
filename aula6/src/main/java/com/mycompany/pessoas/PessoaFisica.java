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
public class PessoaFisica extends Pessoa {

    private String rg;
    
    public PessoaFisica(String nome, String endereco, double rend, String rg) {
        super(nome, endereco, rend);
        this.rg = rg;
    }
    
    @Override
    public double calcularImposto() {
        return this.getRendimentos()*0.18;
    }
    
}
