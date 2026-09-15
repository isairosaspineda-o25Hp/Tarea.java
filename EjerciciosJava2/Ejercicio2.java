import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa la base: ");
        double base = teclado.nextDouble();

        System.out.print("Ingresa la altura: ");
        double altura = teclado.nextDouble();

        double perimetro = 2 * (base + altura);
        double area = base * altura;

        System.out.println("Perimetro = " + perimetro);
        System.out.println("Area = " + area);

    }
}