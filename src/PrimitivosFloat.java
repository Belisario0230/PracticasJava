public class PrimitivosFloat {
    public static void main(String[] args) {
        //float realFloat = 1;// se puede escribir este numero float asi de esta forma
        //float realFloat = 2.23f;// se puede escribir este numero float asi de esta forma
        //float realFloat = 2.12e3f; //2120; desde la e3 se corre 3 numeros a la derecha si es positivo
        //float realFloat = 1.5e4f; //15000; desde la e4 se corre 4 numeros a la derecha si es positivo, cuando es negativo se corre a la izquierda

        float realFloat = 3.4028235E38F; //0.0000000024
        System.out.println("realFloat = " + realFloat);
        System.out.println("tipo de float corresponde en byte a " + Float.BYTES);
        System.out.println("tipo de float corresponde en bites = " + Float.SIZE);
        System.out.println("valor maximo de un float " + Float.MAX_VALUE);
        System.out.println("valor minimo de un float " + Float.MIN_VALUE);

        System.out.println("\n");

        double numeroDouble = 1.7976931348623157E308;
        System.out.println("tipo de double corresponde en byte a " + Double.BYTES);
        System.out.println("tipo de double corresponde en bites = " + Double.SIZE);
        System.out.println("valor maximo de un double " + Double.MAX_VALUE);
        System.out.println("valor minimo de un double " + Double.MIN_VALUE);
    }
}
