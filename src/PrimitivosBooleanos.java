public class PrimitivosBooleanos {
    public static void main(String[] args) {

        boolean datoLogico = true;
        System.out.println("datoLogico = " + datoLogico);

        boolean datoLogico1 = false;
        System.out.println("datoLogico1 = " + datoLogico1);

        double n = 98765.43e-4; //  9.876543
        System.out.println("n = " + n);

        float p = 1.2345e2f; // 123.45
        System.out.println("p = " + p);

        datoLogico = n < p;
        System.out.println("datoLogico = " + datoLogico);

        datoLogico = n > p;
        System.out.println("datoLogico = " + datoLogico);

        boolean esIgual = (3-2 == 1);
        System.out.println("esIgual = " + esIgual);

        boolean esIgual1 =! (3-2 == 1);
        System.out.println("esIgual = " + esIgual1);
    }
}
