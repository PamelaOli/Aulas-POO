/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioaula2;

/**
 *
 * @author ferauche
 */
public class Carro {
    
    private float tanque = 0;
    private float odometro = 0;
    private float consumoMedio = 0;

    
    public Carro(float consumo, float litros) {
        this.consumoMedio = consumo;
        this.tanque = litros;
    }
    
    public void setarVelocidade(float vm, float tempo) {
        float distancia = vm * tempo;
        float litros = distancia / this.consumoMedio;
        
        this.odometro += distancia;
        this.tanque -= litros;
        
        if(this.tanque < 0){
            this.tanque = 0;
        }
    }
    
    public float getTanque() {
        return tanque;
    }
    
    public void setTanque(float tanque) {
        this.tanque = tanque;
    }

    public float getOdometro() {
        return odometro;
    }
    
    public void setOdometro(float odometro) {
        this.odometro = odometro;
    }

    public float getConsumoMedio() {
        return this.consumoMedio;
    }
        
    public void setConsumoMedio(float consumo) {
        this.consumoMedio = consumo;
    }
    
    
    
}
