import javax.swing.*;

public class OperadoresArimeticos {
    public static void main(String[] args) {
        int i = 5, j = 4, suma = i + j;
        System.out.println("suma = " + suma);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("i + j = " + i + j); // JAVA concatena el String con el Numero como lo vemos aqui
        System.out.println("suma = " + i + j); // JAVA concatena el String con el Numero como lo vemos aqui
        System.out.println("i + j = " + (i + j)); // JAVA da prioridad a las operaciones en este caso parentices
        System.out.println(); // esto me sirve aqui como salto de linea en JAVA
        int resta = i-j;
        System.out.println("resta = " + resta);
        System.out.println("i - j = " + (i-j));
        System.out.println();
        int multiplicacion = i*j;
        System.out.println("multiplicacion = " + multiplicacion);
        System.out.println("i * j = " + (i*j));
        System.out.println();
        int division = i/j;
        float div2 = (float) i/ (float) j;
        System.out.println("div2 = " + div2);
        System.out.println("division = " + division);
        System.out.println("i / j = " + (i/j));
        System.out.println();
        int resto = i % j;
        int p = 8, o = 5;
        int resto1 = p % o;
        System.out.println("resto1 = " + resto1);
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Numero"));
        if (numero % 2 == 0){
            System.out.println("numero es par = " + numero);
        }else{
            System.out.println("numero es impar = " + numero);
        }




    }
}
