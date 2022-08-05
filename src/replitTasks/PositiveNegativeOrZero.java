package replitTasks;
import java.util.*;
public class PositiveNegativeOrZero {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        s.close();

        if(num > 0){
            System.out.println("Positive");
        }else if(num < 0){
            System.out.println("Negative");
        }else {
            System.out.println("Zero");
        }



        /*
        Given int num check if the number is positive, negative, or zero

Hint: use 3 if statements to do this

Examples:

num  = 1

positive
num = -6

negative
num = 0

zero
         */


}}
