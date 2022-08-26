/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4;

/**
 *
 * @author CEITELABINFO
 */
public class Pi {
    
    private Double pi = Math.PI;

    public double getPiDouble() {
        return pi.doubleValue();
    }
    public int getPiInt() {
        return pi.intValue();
    }
    
    public float getPiFloat() {
        return pi.floatValue();
    }
    
    public String getPiStr() {
        return pi.toString();
    }
    
}
