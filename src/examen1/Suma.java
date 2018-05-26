
package examen1;

public class Suma extends Operacion{

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }
    
    public Suma(double valor1, double valor2) {
        super(valor1, valor2);
    }
    
    public double calcular(){
        double suma=0;
        suma=valor1+valor2;
        return suma;
        
    }


}
