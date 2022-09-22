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
public class Livro extends Produto{
    
    private String isbn;
    
    public Livro(){
        
    }
    
    public Livro(String nome, double valor, String isbn){
        this.nome = nome;
        this.valor = valor;
        this.isbn = isbn;
        
        
    }
    
    public double getValorLiquido(){
        return this.valor*0.75;
    }
}
