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
public class PessoaJuridica extends Pessoa {
    
    private String cnpj;
    
    public PessoaJuridica(String nome, String end, double rend, String cnpj) {
        super(nome, end, rend);
        this.cnpj = cnpj;
    }
    
    @Override
    public double calcularImposto() {
        if(this.getRendimentos()< 3000) {
            return this.getRendimentos()*0.11;
        }
        else {
            return this.getRendimentos()*0.275;
        }
    }
    
    public double calcularImposto(double taxa) {
        return this.getRendimentos()*taxa;
    }
    
    
}
