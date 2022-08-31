package day25_CustomMethods_Overloading.day25_CustomMethods_Overloading;

public class SumOfNumbers {

    public static void main(String[] args) {

        int sum =sumOf2Numbers(45,78);

        System.out.println("sum = "+sum);

        System.out.println("----------------------");

        int sum2 = sumOf3Numbers(67,90,78);

        System.out.println("sum = "+sum2);

        System.out.println("-------------------------");

        int sum3 = sumOf4Numbers(67,90,78,74);

        System.out.println("sum = "+sum3);
    }





    public static int sumOf2Numbers (int num1, int num2){
        return num1+num2;
    }

    public static int sumOf3Numbers (int num1,int num2,int num3){
        return num1+num2+num3;
    }

    public static int sumOf4Numbers (int num1, int num2,int num3,int num4){
        return num1+num2+num3+num4;
    }
}
/*
Task1:
	    1. create a method that can find the sum of two numbers
	                    method name: sumOf2Numbers
	    2. create a method that can find the sum of three numbers
	                    method name: sumOf3Numbers
	    3. create a method that can find the sum of four numbers
	                    method name: sumOf4Numbers
 */
