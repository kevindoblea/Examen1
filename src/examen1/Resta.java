/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

public class Resta extends Operacion {
    
    public Resta(double valor1, double valor2) {
        super(valor1, valor2);
    }

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
        public double calcular(){
        double suma=0;
        suma=valor1-valor2;
        return suma;
        
    }
    
    
}
