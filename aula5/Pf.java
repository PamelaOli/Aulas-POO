
package aula5;


public class Pf extends Pessoa{
    
    public double calcularImposto(double rendimento){
        if (rendimento <= 3000) return rendimento*0.11;
        return rendimento*0.275;
    }
}
