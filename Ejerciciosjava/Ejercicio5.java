public class Ejercicio5 {

    public static void main(String[] args) {

        int[] numeros = {11, 22, 33, 44, 55, 66, 77, 88, 99, 100};

        int pares = 0;
        int impares = 0;

        System.out.println("Valores del arreglo:");

        for (int i = 0; i < numeros.length; i++) {

            System.out.println(numeros[i]);

            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
    }
}
