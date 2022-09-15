package aula5;

import java.util.Scanner;
public class Aula5 {

    
    public static void main(String[] args) {
        Pj empresa = new Pj();
        empresa.setRendimentos(100);
        double rendapj = empresa.calcularImposto(empresa.getRendimentos());
        System.out.println(rendapj);
        
        Pf func = new Pf();
        func.setRendimentos(4000);
        double rendapf = func.calcularImposto(func.getRendimentos());
        System.out.println(rendapf);
        
    }
    
}
