/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

/**
 *
 * @author CEITELABINFO
 */
public class Pj extends Pessoa{
    
    private String cnpj; 
    
    public double calcularImposto(double rendimento){
        return rendimento*0.18;
    }
}
