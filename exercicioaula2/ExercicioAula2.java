/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioaula2;

import java.util.Scanner;

/**
 *
 * @author ferauche
 */
public class ExercicioAula2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Qual o consumo médio do carro..: ");
        float consumo = sc.nextFloat();
        
        System.out.printf("Com quantos litros está o tanque..: ");
        float litros = sc.nextFloat();
        
        Carro c = new Carro(consumo, litros);
        
        while(c.getTanque() > 0 ) {
            System.out.printf("Qual a velocidade do veículo..: ");
            float v = sc.nextFloat();
            
            System.out.printf("Por quantas horas............: ");
            float t = sc.nextFloat();
            c.setarVelocidade(v, t);
            
            System.out.println("Odomentro..: "+c.getOdometro());
            System.out.println("Tanque.....: "+c.getTanque());
            System.out.println("================================");
        }
    }
    
}
