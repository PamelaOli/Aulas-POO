/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula2;

/**
 *
 * @author Pâmela
 */
public class Carro {
    private float tanque = 0;
    private float odometro = 0;
    private float consumoMedio = 0;
    
    public Carro(){
        
       
    }
    public Carro(float consumo, float tanque){
        this.tanque = tanque;
        this.consumoMedio = consumo;
    }
    public void SetVel(float vm, float time){
        float distancia  = vm * time;
        float litro = distancia / this.consumoMedio;
            
        this.odometro += distancia;
        this.tanque -= litro;
    
        if(this.tanque < 0) {
        	this.tanque = 0;
        }
    }
    
    public float getTanque() {
        return this.tanque;
    }

    public float getOdometro() {
        return odometro;
    }

    public float getConsumoMedio() {
        return consumoMedio;
    }
        
    public void setConsumoMedio(float consumo) {
        this.consumoMedio = consumo;
    }
}
