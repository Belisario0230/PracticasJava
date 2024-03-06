public class OperadoresAsignacion {
    public static void main(String[] args) {
        int i = 5;
        int j = i + 4;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        i += 2;
        System.out.println("i = " + i);

        i += 5;
        System.out.println("i = " + i);

        j -= 4;
        System.out.println("j = " + j);

        j *= i;
        System.out.println("j = " + j);

        j *= 10;
        System.out.println("j = " + j);

        String sqlString = "select * from clientes as c";
        sqlString += " where c.nombre'Belisario' ";
        sqlString += "and c.activo1";
        System.out.println("sqlString = " + sqlString);




    }
}
