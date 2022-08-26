/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

import java.util.Scanner;

public class Aula3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Qual o valor MAXIMO do tanque..: ");
        float max = sc.nextFloat();
        
        System.out.printf("Qual o valor MINIMO do tanque..: ");
        float min = sc.nextFloat();
        
        Tanque tanque1 = new Tanque();
        
        tanque1.setVolumeMin(min);
        tanque1.setVolumeMax(max);
        tanque1.setVolumeAtual(0);
        
        int menu = Menu();
        while(menu != 4){
        
            switch(menu){
                case 1:
                    System.out.print("Valor a se encher: ");
                    float litros = sc.nextFloat();
                    if(tanque1.getVolumeMax() >= (tanque1.getVolumeAtual() + litros)){
                        tanque1.encher(litros);
                    }else{
                        System.out.println("Valor atual maior ou igual que o Volume Max: ");
                    }
                break;
                case 2:
                    System.out.print("Valor a se esvaziar: ");
                    float litrosEs = sc.nextFloat();
                    if(tanque1.getVolumeMin() <= (tanque1.getVolumeAtual() - litrosEs)){
                        tanque1.esvaziar(litrosEs);
                    }else{
                        System.out.println("Valor atual menor ou igual que o Volume Min: ");
                    }
                break;
                case 3:
                    System.out.println("Volume atual: " + tanque1.getVolumeAtual());
                    System.out.println("Estado da bomba: "+ tanque1.exibirInfos());
                    System.out.println("-------------------------------------------");
                break;
            }
            menu = Menu();
        }
        
    }
    
    public static int Menu(){
        Scanner scanner1 = new Scanner(System.in);
        
        System.out.println("Digite 1 para ENCHER o tanque");
        System.out.println("Digite 2 para ESVAZIAR o tanque");
        System.out.println("Digite 3 para EXIBIR");
        System.out.println("Digite 4 para SAIR");
        
        int menu = scanner1.nextInt();
        
        return menu;
    }
    
}
