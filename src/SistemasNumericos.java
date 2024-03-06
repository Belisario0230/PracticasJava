import javax.swing.*;

import javax.swing.*;

/* App para que el usuario imprima en patalla utilizando la opcion JOptionPane.ShowInputDialog, en el codigo de abajo se refactorizo el codigo y se hizo mas resumido, escalable y funcional
public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un Numero Entero");
        int numeroDecimal = Integer.parseInt(numeroStr);

        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println("numeroBinario = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b1100100; // para representar un Num binario antepone 0b + numero
        System.out.println("numeroBinario = " + numeroBinario);

        System.out.println("numero octal  " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
        int numeroOctal = 036; // para representar un Num octal anteponemos el Numero 0  + numero
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println("numeroHexadecimal = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        int numeroHex = 0x64; // para representar un Num HexaDecimal anteponemos el Numero 0x  + numero
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = ("numeroBinario = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
        mensaje += ("\nnumero octal  " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
        mensaje +=  ("\nnumeroHexadecimal = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        JOptionPane.showMessageDialog(null, mensaje);
    }

}*/

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un Numero Entero");

        int numeroDecimal = 0;
        try{
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error Debe Ingresar un Numero Entero");
            main(args);
            System.exit(0);
        }

        String resultadoBinario = ("numeroBinario = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
        System.out.println(resultadoBinario);

        int numeroBinario = 0b1100100; // para representar un Num binario antepone 0b + numero
        System.out.println("numeroBinario = " + numeroBinario);

        String resultadoOctal = ("numero octal  " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
        System.out.println(resultadoOctal);
        int numeroOctal = 036; // para representar un Num octal anteponemos el Numero 0  + numero
        System.out.println("numeroOctal = " + numeroOctal);

        String resultadoHexaDecimal = ("numeroHexadecimal = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        System.out.println(resultadoHexaDecimal);
        int numeroHex = 0x64; // para representar un Num HexaDecimal anteponemos el Numero 0x  + numero
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = (resultadoBinario);
        mensaje += ("\n" + resultadoOctal);
        mensaje +=  ("\n" + resultadoHexaDecimal);
        JOptionPane.showMessageDialog(null, mensaje);
    }

}
