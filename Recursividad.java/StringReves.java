public class StringReves {

    public static void main(String[] args) {

        String texto = "Sistemas";

        System.out.println("Texto original: " + texto);
        System.out.println("Texto al revés: " + invertirCadena(texto));
    }

    public static String invertirCadena(String texto) {

        if (texto == null || texto.length() <= 1) {
            return texto;
        }

        return texto.charAt(texto.length() - 1)
                + invertirCadena(texto.substring(0, texto.length() - 1));
    }
}
    

