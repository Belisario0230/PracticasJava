public class PrimitivosCaracteres {
    public static void main(String[] args) {
        var caracter = '\u0040';
        var decimal = 64;
        char caracter1 = '@';

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n'; // o se puede hacer asi tambien System.getProperty("line.separator") or System.lineSeparator() //
        char retornoCarro = '\r';

        System.out.println("retorn\roCarro = " + retornoCarro);;
        System.out.println("tabu\blad\tor1 = " + tabulador);
        System.out.println("espacio = " + espacio);
        System.out.println("retroceso = " + retroceso); // si repites retroceso 2 veces quitas dos caracteres o espacios
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = caracter" + (decimal == caracter));
        System.out.println("caracter1 = " + caracter1);
        System.out.println("tipo de char corresponde en byte a " + System.getProperty("line.separator") + Character.BYTES);
        System.out.println("tipo de char corresponde en bites = " + System.lineSeparator() + Character.SIZE);
        System.out.println("valor maximo de un char " + Character.MAX_VALUE);
        System.out.println("valor minimo de un char " + Character.MIN_VALUE);

    }
}
