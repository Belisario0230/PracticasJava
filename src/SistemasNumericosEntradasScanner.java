
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradasScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un Numero Entero");

        //String numeroStr = scanner.nextLine();

        int numeroDecimal = 0;
        try{
            numeroDecimal = scanner.nextInt(); //Integer.parseInt(numeroStr);
        } catch (InputMismatchException e){
            System.out.println("Error Debe Ingresar un Numero Entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);;
        String resultadoBinario = ("numeroBinario = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
        String resultadoOctal = ("numero octal  " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
        String resultadoHexaDecimal = ("numeroHexadecimal = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));

        String mensaje = (resultadoBinario);
        mensaje += ("\n" + resultadoOctal);
        mensaje +=  ("\n" + resultadoHexaDecimal);
        System.out.println(mensaje);
    }

}
