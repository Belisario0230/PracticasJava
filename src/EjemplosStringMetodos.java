public class EjemplosStringMetodos {
    public static void main(String[] args) {
        String nombre = "Belisario";
        System.out.println("nombre.length = " + nombre.length());
        System.out.println("nombre.toUpperCase()= " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase()= " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Belisario\") = " + nombre.equals("Belisario"));
        System.out.println("nombre.equals(\"belisario\") = " + nombre.equals("belisario"));
        System.out.println("nombre.equalsIgnoreCase(\"belisario\") = " + nombre.equalsIgnoreCase("belisario"));
        System.out.println("nombre.compareTo(\"Belisario\") = " + nombre.compareTo("Belisario"));
        System.out.println("nombre.compareTo(\"Buitrago\") = " + nombre.compareTo("Buitrago"));
        System.out.println("nombre.chartAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.chartAt(4) = " + nombre.charAt(4));
        System.out.println("nombre.chartAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-3));
        System.out.println("nombre.substring(3) = " + nombre.substring(3));
        System.out.println("nombre.substring(0,4) = " + nombre.substring(0,4));
        System.out.println("nombre.substring(nombre.length()-4) = " + nombre.substring(nombre.length()-4));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas.replace("a", "..."));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf(b) = " + trabalenguas.indexOf("b"));
        System.out.println("trabalenguas.lastIndexOf(a) = " + trabalenguas.lastIndexOf("a"));
        System.out.println("trabalenguas.contains('n') = " + trabalenguas.contains("n"));
        System.out.println("nombre.contains('Beli') = " + nombre.contains("Beli"));
        System.out.println("trabalenguas.startWith(\"trabalen\") = " + trabalenguas.startsWith("trabalen"));
        System.out.println("trabalenguas.endstWith(\"trabalen\") = " + trabalenguas.endsWith("trabalen"));
        System.out.println("trabalenguas.endstWith(\"guas\") = " + trabalenguas.endsWith("guas"));
        System.out.println("    trabalenguas    ");
        System.out.println("    trabalenguas    ".trim());


    }
}
