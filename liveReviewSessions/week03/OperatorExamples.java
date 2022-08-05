package week03;

public class OperatorExamples {

    public static void main(String[] args) {
        // Assignment Operator
         int x = 10;

         x+= 2; // x= x+2 = 12
        System.out.println("x = " + x);//12

        x-=2;
        System.out.println("x = " + x); //10

        x*= 2;
        System.out.println("x = " + x); //20

        x/= 2;
        System.out.println("x = " + x);//10

        x%= 2;
        System.out.println("x = " + x);//0

        //RELATIONAL OPERATORS: > , < , >= , <= result is boolean either true or false

        int num1 = 10;
        int num2 = 5;
        boolean b = num1>num2; // true

        System.out.println("First number number is greater than second number: "+b);






    }
}
