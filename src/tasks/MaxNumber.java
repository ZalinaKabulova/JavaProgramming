package tasks;

public class MaxNumber {
    public static void main(String[] args) {
        /*
        3. Write a program that can print the maximum number between two numbers, if both are equal then print Equal
           Ex: n1= 100, n2 = 200;
           output: 200 is maximum number
*/
        int n1, n2;
        n2 = 200;
        n1 = 100;
         boolean num1IsMax = n1 >= n2,
                 num2isMax = n2 >= n1,
                 equal = n1 == n2;
         if(num1IsMax){
             System.out.println(n1+ " is maximum number");
         }
         if(num2isMax){
             System.out.println(n2+ " is maximum number");
         }
         if(equal){
             System.out.println(n1+" and "+ n2 +" are equal");
         }


    }
}
