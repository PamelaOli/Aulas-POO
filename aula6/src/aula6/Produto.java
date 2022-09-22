/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6;

/**
 *
 * @author CEITELABINFO
 */
public class Produto {
    
    protected String nome;
    protected double valor;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor() {
        this.valor = valor;
    }

    public double getValorLiquido(){
        return 0;
    }
}
