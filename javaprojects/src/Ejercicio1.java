import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número cualquiera: ");
        int numero = Integer.parseInt(scanner.nextLine());

        if (numero % 2 == 0) {
            System.out.println("El número es divisible entre 2");
        } else {
            System.out.println("El número no es divisible entre 2");
        }

        scanner.close();
    }
}