public class Potencia {

    public static void main(String[] args) {
        int base = 2;
        int exponente = 4;

        System.out.println(
            base + " elevado a la " +
            exponente + " es: " +
            calcularPotencia(base, exponente)
        );
    }

    public static int calcularPotencia(int base, int exponente) {

        if (exponente == 0) {
            return 1;
        }

        return base * calcularPotencia(base, exponente - 1);
    }
}