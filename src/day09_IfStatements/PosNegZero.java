package day09_IfStatements;

public class PosNegZero {
    public static void main(String[] args) {
        int n = 100;

        if(n > 0) {
            System.out.println("Positive");
        }

        if(n < 0) {
            System.out.println("Negative");
        }

        if(n ==0) {
            System.out.println("Zero");
        }

        System.out.println("--------------------------------");

        boolean positive = n > 0;
        boolean negative = n < 0;

        if(positive){
            System.out.println("Positive");
        } else if (negative) {
            System.out.println("Negativ");

        } else {
            System.out.println("Zero");
        }
        // if & else statement we can NEVER apply for the tasks that requires more than two condition!
/* if only one condition statement only you go with Single IF
        if you need to create two conditional statement you will go with IF and ELSE
        three or more conditional statement go with multi- branch IF
         */


    }}
