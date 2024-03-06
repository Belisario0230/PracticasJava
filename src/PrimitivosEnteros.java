public class PrimitivosEnteros {
    public static void main(String[] args) {
        byte numeroByte = 127;

        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo de byte corresponde en byte a " + Byte.BYTES);
        System.out.println("tipo de bites corresponde en bites a " + Byte.SIZE);
        System.out.println("valor maximo de un byte " + Byte.MAX_VALUE);
        System.out.println("valor minimo de un byte " + Byte.MIN_VALUE);

        System.out.println("\n");

        short numeroShort = 32767;
        System.out.println("numero short = " + numeroShort);
        System.out.println("tipo de short corresponde en byte a " + Short.BYTES);
        System.out.println("tipo de short corresponde en bites = " + Short.SIZE);
        System.out.println("valor maximo de un short " + Short.MAX_VALUE);
        System.out.println("valor minimo de un short " + Short.MIN_VALUE);

        System.out.println("\n");

        int numeroInt = 2147483647;
        System.out.println("tipo de int corresponde en byte a " + Integer.BYTES);
        System.out.println("tipo de int corresponde en bites = " + Integer.SIZE);
        System.out.println("valor maximo de un int " + Integer.MAX_VALUE);
        System.out.println("valor minimo de un int " + Integer.MIN_VALUE);


        System.out.println("\n");

        long numeroLong = 9223372036854775807L;
        System.out.println("tipo de long corresponde en byte a " + Long.BYTES);
        System.out.println("tipo de long corresponde en bites = " + Long.SIZE);
        System.out.println("valor maximo de un long " + Long.MAX_VALUE);
        System.out.println("valor minimo de un long " + Long.MIN_VALUE);

        System.out.println("\n");

        var numeroVar = 92233720368547758073D;

    }
}
