package week03;

public class UnaryOperatorExamples {
    public static void main(String[] args) {
        int a = 25;

        System.out.println(++a); //26 pre- increment
        System.out.println(--a); //25 pre- decrement

        int b =25;

        System.out.println(b++);// first use the value then increase-- print 25 then increase to 26
        System.out.println(b--); // 26 first use the value then decrease
        System.out.println(b); // 25
        System.out.println("----------------------------------------------");


        a = 50;

        a = --a + a++ + a-- + a++; // 49 + 49+ 50+ 49
        System.out.println("a = " + a); // 197

        int z = 1000;
        int z1 = (byte)z;
        System.out.println(z1);

        a = 1;
        a = - a-- + a++ / (-a-- * --a); // -1
        System.out.println("a = " + a);

        boolean b1 = true;
        System.out.println(!b1);
    }

}
