public class ejemploStrConcatenacion {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String profesor = "Andres Guzman";
        String detalle = curso + " Con el profesor " + profesor;
        System.out.println("detalle = " + detalle);

        int numeroA = 20;
        int numeroB = 30;

        System.out.println("detalle = " + numeroA + numeroB);
        System.out.println("detalle = " + (numeroA + numeroB));
        System.out.println(numeroA + numeroB + detalle);

        String detalle2 = curso.concat(" con ").concat(profesor);
        System.out.println("detalle2 = " + detalle2);

    }
}
