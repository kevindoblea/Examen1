
package examen1;

abstract class Operacion{
    double valor1,valor2;
    abstract double calcular();

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

    public Operacion(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
   
}
