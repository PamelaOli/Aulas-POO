/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula2;

import java.util.Scanner;

/**
 *
 * @author Pâmela
 */
public class Aula2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Entre com a quantidade de combustivel: ");
	float fuel = sc.nextFloat();
	        
	System.out.print("Entre consumo medio do Carro: ");
	float conMedio = sc.nextFloat();
	        
	Carro car = new Carro();
	        
	System.out.println("tanque: " + car.getTanque());
        System.out.println("consumo medio: " + car.getConsumoMedio());
                
        while(car.getTanque() > 0){
            System.out.println("VelMedia");
            float velM = sc.nextFloat();
                
            System.out.println("TempoCarPermVel");
            float timeCar = sc.nextFloat();
                
            car.SetVel(velM, timeCar);
                
            System.out.println("tanque: " + car.getTanque());
	    System.out.println("odometro: " + car.getOdometro());
        }
    }
}
