public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++){
            //c = c.concat(a).concat(b).concat("\n"); //500 => 3ms, 1000=> 4 ms, 10000 => 105ms
            //c += a + b +"\n"; // 500 => 29 Ms, 1000 => 31ms, 10000 =>68ms
            //sb.append(a).append(b).append("\n"); // 500 => 1 Ms, 1000= 3ms, 10000 => 4ms
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c =" + c);
        System.out.println("sb = " + sb.toString());

    }
}
