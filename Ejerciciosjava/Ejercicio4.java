import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.print("Ingrese un número para buscar: ");
        int buscar = Integer.parseInt(scanner.nextLine());

        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] == buscar) {
                encontrado = true;
            }
        }

        if (encontrado) {
            System.out.println("El número fue encontrado en el arreglo.");
        } else {
            System.out.println("El número no se encuentra en el arreglo.");
        }

        scanner.close();
    }
}