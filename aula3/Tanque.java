/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

/**
 *
 * @author CEITELABINFO
 */
public class Tanque {
    
    private float volumeMax;
    private float volumeAtual;
    private float volumeMin;
    private boolean bomba;

    public float getVolumeMax() {
        return volumeMax;
    }

    public void setVolumeMax(float volumeMax) {
        this.volumeMax = volumeMax;
    }

    public float getVolumeAtual() {
        return volumeAtual;
    }

    public void setVolumeAtual(float volumeAtual) {
        this.volumeAtual = volumeAtual;
    }

    public float getVolumeMin() {
        return volumeMin;
    }

    public void setVolumeMin(float volumeMin) {
        this.volumeMin = volumeMin;
    }

    public boolean isBomba() {
        return bomba;
    }

    public void setBomba(boolean bomba) {
        this.bomba = bomba;
    }
    
    public float encher(float litros) {
        return this.volumeAtual = this.volumeAtual + litros;
    }
    
    public float esvaziar(float litros) {
        return this.volumeAtual =  this.volumeAtual - litros;
    }
    
    public String exibirInfos() {
        this.bomba = this.volumeAtual >= this.volumeMin;
        if(this.bomba){
            return "Ligada";
        }
        return "Desligada";
    }
    
}
