/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4;

import java.util.Scanner;
        
public class Aula4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pi piValue = new Pi();
        
        int menu = Menu();
        
        while(menu != 5){
            switch(menu){
                case 1:
                    System.out.println(piValue.getPiDouble());
                break;
                case 2:
                    System.out.println(piValue.getPiFloat());
                break;
                case 3:
                    System.out.println(piValue.getPiInt());
                break;
                case 4:
                    System.out.println(piValue.getPiStr());
                break;
            }
            menu = Menu();
        }
    }
       public static int Menu(){
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Double 1: ");
        System.out.println("Float 2: ");
        System.out.println("Int 3: ");
        System.out.println("String 4:");
        System.out.println("Encerrar 5: ");
        
        int menu = scanner1.nextInt();
        
        return menu;
    }
}
  
