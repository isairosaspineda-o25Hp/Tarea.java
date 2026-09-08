public class Ejercicio3 {

    public static void main(String[] args) {

        int[] numeros = {12, 25, 8, 40, 15, 35, 50, 20};

        int mayor = numeros[0];

        System.out.println("Contenido del arreglo:");

        for (int i = 0; i < numeros.length; i++) {

            System.out.println(numeros[i]);

            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        System.out.println("El número mayor es: " + mayor);
    }
}
