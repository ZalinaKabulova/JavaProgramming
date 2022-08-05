package week03;

public class SmallConditionalTasks {
    public static void main(String[] args) {
        //Write an if statement that assigns 5 to x when y is equal to 20
        /*
        When we are dealing with Variables there are two actions 1. Declare 2.
         */

        int y = 20;
        int x; // declared my variable but not value

        /*if(y == 20){
            // code segment
            x = 5;
        }*/

        boolean b = y == 20; // true
        if(b){  // if the condition is not met what the compiler will do
            x = 5; // initialize
    }else  {x = 0;
        System.out.println("x = " + x);

        // Our compiler is DUMB: you need to tell every step

            char ch1 = 'A';
            char ch2 = 'Z';

            if(ch2 > ch1) {
                System.out.println("Second Character comes after First One");
            } else{
                System.out.println("First character comes after Second One");

            }
        }
        int age ;  // declare
        age = 10;
        String eligibleOrNot ;
        if(age >= 18 ){
            eligibleOrNot = "Eligible";
        }else{
            eligibleOrNot = "Not Eligible";
        }
        System.out.println("eligibleOrNot for Voting = " + eligibleOrNot);




    }
}
