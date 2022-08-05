package week02;

public class PrimitiveExamples {
    public static void main(String[] args) {
        //Variables: Primitive Types: Numbers || Characters || Boolean
        /*
        Numbers: Integers====> byte =>short==>int===>long
        Decimals(floating points)=====>
         */
        //Datatype
        /*
        DataType variableName = Value; Declare and 2. Initialize at the same line

        Datatype variableName;
         */

        /* byte num1; // Declare a variable
        num1 = 123; // Initialize, assign a value

        num1 = 121; // re- assign a different value

        short num2 = 12398; // declare and initialize

        int distance = 1_000_000_000;
        System.out.println("distance = " + distance);

        long distanceMore = 3_000_000_000L; // passing the limit so I have to put L
        long distanceShorter = 1_000_000_000L; // inside the limit

        float rate = 1000.5F;
        double dNumber = 123.4;

        System.out.println("------After Castings--------");
        // I will assign num1 (byte) to num2 (short) -----> from smaller dataType to bigger dataType

        num2 = num1; // there is implicit casting: done by complier
        System.out.println("dNumber = " + dNumber);

        // I will assign distance variable value to num2 variable -----> from bigger dataType to a smaller dataType
        num2 = (short)distance; // explicit casting -----> done by developer/tester
        System.out.println("num2 = " + num2);

        char ch = 'a';
        System.out.println("ch = " + ch);

        int x = 5 + ch; // 97 = 'a' Ascii Table
        System.out.println("x = " + x);

        String str = ""+'J'+'a'+'v'+'a'; //empty ""; makes all the chars coming after to turn into Strings

        System.out.println("str = " + str); // Java
        /*
        Note: Important rule of java ===> java runs from left to right : String+char = String
        "C" ====> String
        'C' ====> char
         */
        /* int y ='J'+'a'+'v'+'a';
        System.out.println("y = " + y); //386
        boolean b1 = true; // you can assign conditions to these variable
        boolean b2 = false;
        System.out.println("b2 = " + b2); */

        /* int Java = 'J' + 'a' + 'v' + 'a' ;
        int J ='J';
        int a = 'a';
        int v = 'v';
        System.out.println("J = " + J);
        System.out.println("a = " + a);
        System.out.println("v = " + v);
        System.out.println("a = " + a);
        System.out.println("Java = " + Java);*/

        char r = 'J' + 'a' + 'v' + 'a' ;
        int y = r;
        int J ='J';
        int a = 'a';
        int v = 'v';
        System.out.println("J = " + J);
        System.out.println("a = " + a);
        System.out.println("v = " + v);
        System.out.println("a = " + a);
        System.out.println("Java = " + y);

    }
}
