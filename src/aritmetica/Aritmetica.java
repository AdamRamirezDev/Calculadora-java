package aritmetica;

public class Aritmetica {

    int operando1;
    int operando2;

    public Aritmetica(int op1, int op2){
        operando1 = op1;
        operando2 = op2;
    }

    public void sumar(){
        var resultado = operando1 + operando2;
        System.out.println("Resultado: " + resultado);
    }

    public void restar(){
        var resultado = operando1 - operando2;
        System.out.println("Resultado: " + resultado);
    }


}