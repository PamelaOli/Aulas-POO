/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6;

import java.util.Scanner;

public class Aula6 {

    
    public static void main(String[] args) {
        Produto[] p = new Produto[3];
        Scanner sc = new Scanner(System.in);
        double soma =0;
       
        for(int i = 0; i < 3; i++){
            
            System.out.println("1- Livro");
            System.out.println("2- DVD");
            int op = sc.nextInt();
            System.out.print("Nome..: ");
            sc = new Scanner(System.in);
            String nome = sc.nextLine();
            System.out.print("Valor.: ");
            sc = new Scanner(System.in);
            
            
            double valor = sc.nextDouble();
            
            if(op == 1) {
                System.out.print("Entre com ISBN..: ");
                sc = new Scanner(System.in);
                String ISBN = sc.nextLine();
                Livro l = new Livro(nome,valor,ISBN);
                p[i] = l;
            }
            else {
                System.out.print("Entre com SN..: ");
                sc = new Scanner(System.in);
                sc.next();
                String SN = sc.nextLine();
                Dvd d = new Dvd(nome, valor, SN);
                p[i] = d;
            }   
        }
        
        for(Produto prod : p) {
            System.out.println();
            System.out.println("Nome: "+prod.getNome());
            System.out.println("Valor: "+prod.getValor());
            System.out.println("Valor Liq "+prod.getValorLiquido());
            soma += prod.getValorLiquido();
        }
       
        System.out.println(soma);
    }
}
