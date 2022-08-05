package day27_WrapperClasses;

import static java.lang.System.out;

public class WrapperClassMethods {

    public static void main(String[] args) {   // 1. parse methods: converts String to primitive

        String str = "123";

        int num = Integer.parseInt(str);

        System.out.println(num+1);  // 124 =====> as integer ==== primitive number
        System.out.println(str+1);  //1231 =====> as String ===== non primitive object

        String str2 = "10.5";

        double num2 = Double.parseDouble(str2); // double

        System.out.println(num2 + 1);

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println(max);
        System.out.println(min);

        long max2 = Long.MAX_VALUE;
        long min2 = Long.MIN_VALUE;

        System.out.println(max2);
        System.out.println(min2);

        String s1 = "true";  //with "true" the statement is always true,with another statement always false

        boolean r1 = Boolean.parseBoolean(s1);

       System.out.println(r1);

        System.out.println("---------------------------------------------------");

                          //2. valueOf methods: converts String to wrapper class

        String s2 = "123";

        Integer x = Integer.valueOf(s2); // converts String to wrapper class
        int x1 = Integer.valueOf(s2);    // unboxing

        System.out.println(x);
        System.out.println(x1);

        String s3 = "1.5";
        Double z = Double.valueOf(s3);// Double

        System.out.println(z);

        out.println("--------------------------");


        // isDigit()

        char ch1 = '!';

        //isDigit()
        boolean r2 = Character.isDigit(ch1);

        //isLetter()
        boolean r3 = Character.isLetter(ch1);

        //special char
        boolean r4 = !Character.isLetterOrDigit(ch1);

        //UpperCase
        boolean r5 = Character.isUpperCase(ch1);

        //lowerCase
        boolean r6 = Character.isLowerCase(ch1);

        out.println(r2);
        out.println(r3);
        out.println(r4);
        out.println(r5);
        out.println(r6);

        out.println("------------------------------------");

        String s = "ab1cde2efg3hi4";

        int sum = 0;

        for (char each : s.toCharArray()) {

            if(Character.isDigit(each)){
                sum += Integer.parseInt(each+"");

            }
        }

        out.println("sum = "+sum);










    }
}
