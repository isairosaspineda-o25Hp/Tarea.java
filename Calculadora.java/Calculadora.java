import java.util.Scanner;

public class Calculadora{

    public int sumar(int valor1, int valor2){
        int resultado = valor1 + valor2;
        return resultado;

    }

    public int restar(int valor1, int valor2){
        int resultado = valor1 - valor2;
        return resultado;

    }

    public int multiplicacion(int valor1, int valor2){
        int resultado = valor1 * valor2;
        return resultado;
    }

    public double division(double valor1, double valor2){
        double resultado = valor1 / valor2;
        return resultado;
    }
    public void opciones(int opcion1){
        switch (opcion1) {
            case 1:
                System.out.println("El resultado de la suma es: " + sumar(8 , 9));
                break;
            case 2:
                System.out.println("El resultado de la resta es: " + restar(8 , 9));
                break;
            case 3:
                System.out.println("El resultado de la multiplicacion es: " + multiplicacion(8 , 9));
                break;
            case 4:
                System.out.println("El resultado de la division es: " + division(8 , 9));
                break;
            default:
                throw new AssertionError();
        }
    }


    public static void main(String[] args) {
        int op = 0;
        Scanner sc = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        System.out.println("¿Que opcion deseas hacer?");
        op = sc.nextInt();
        calculadora.opciones(op);
    



    }

}


