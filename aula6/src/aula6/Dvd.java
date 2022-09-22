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
public class Dvd extends Produto{
    private String sn;
    
    public Dvd(){
        
    }
    
    public Dvd(String nome, double valor, String sn){
        this.nome = nome;
        this.valor = valor;
        this.sn = sn;
    }
    
    public double getValorLiquido(){
        return this.valor*0.9;
    }
}
