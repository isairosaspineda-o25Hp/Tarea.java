public class Ejercicio2 {

    public static void main(String[] args) {

        int[] numeros = {10, 20, 30, 40, 50};

        int suma = 0;

        System.out.println("Valores del arreglo:");

        for (int i = 0; i < numeros.length; i++) {

            System.out.println(numeros[i]);

            suma = suma + numeros[i];
        }

        double promedio = (double) suma / numeros.length;

        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + promedio);
    }
}