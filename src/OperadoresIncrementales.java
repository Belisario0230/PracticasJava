public class OperadoresIncrementales{
    public static void main(String[] args) {

        //Pre Incremento
        System.out.println("Pre Incremento");
        int i = 5;
        int j = ++i; // i = i + 1

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Post Incremento
        System.out.println("Post Incremento");
        i = 12;
        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Pre decremento
        System.out.println("Pre decremento");
        i = 8;
        j = --i; // i=i -i = 2
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Post decremento
        System.out.println("Post decremento");
        i = 10;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);




    }
}
