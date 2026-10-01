public class Fibonacci {

    public static void main(String[] args) {
        int posicion = 7;

        System.out.println(
            "El número Fibonacci en la posición "
            + posicion + " es: "
            + fibonacci(posicion)
        );
    }

    public static int fibonacci(int n) {

        if (n <= 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}