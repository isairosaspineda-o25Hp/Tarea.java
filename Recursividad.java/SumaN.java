public class SumaN {

    public static void main(String[] args) {
        int n = 5;
        int resultado = sumarHastaN(n);

        System.out.println("La suma de 1 a " + n + " es: " + resultado);
    }

    public static int sumarHastaN(int n) {

        if (n <= 1) {
            return n;
        }

        return n + sumarHastaN(n - 1);
    }
}