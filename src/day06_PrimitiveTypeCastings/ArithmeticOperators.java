package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {

    public static void main(String[] args) {
        System.out.println("12" + 1); //121, convatenation

        System.out.println(10 + 20); // 30, Addition
        System.out.println(100 - 50); //50, subtraction
        System.out.println(10 * 60); //60, multiplication

        System.out.println(10 / 3); //33
        System.out.println(10.0 / 4); //2.5
        System.out.println(10 / 4.0); //2.5
        System.out.println(10d / 4); //2.5

        /*
        +: Addition
        -: Subtract
        *: Multiplication
        /: Division

                     integer / integer=====> integer
                     decimal / decimal=====> decimal
                     integer / decimal=====> decimal
                     decimal / decimal=====> decimal

                     in math:
                          10/4= 2.5
                          100/3 = 33.3333...

                     in java:
                          10/4 = 2
                          10.0/4 = 2.5
                          100/3 = 33
         */
        int a = 100;
        double b = a / 6; //16
        System.out.println(b);

        double c = a / 6d;   // 16.66666
        //double c = (double)a/6;


        System.out.println(c);

        System.out.println(100D);


    }
}
