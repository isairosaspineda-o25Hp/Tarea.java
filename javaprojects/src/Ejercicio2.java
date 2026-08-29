import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precioOriginal = Double.parseDouble(scanner.nextLine());

        final int IVA = 21;

        double precioFinal = precioOriginal + (precioOriginal * IVA / 100);

        System.out.println("Precio original: " + precioOriginal);
        System.out.println("IVA aplicado: " + IVA + "%");
        System.out.println("Precio final con IVA: " + precioFinal);

        scanner.close();
    }
}