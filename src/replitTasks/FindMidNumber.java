package replitTasks;

import java.util.Scanner;

public class FindMidNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int medium = 0;
        System.out.println("Enter first number:");
        int num1 = scan.nextInt();

        System.out.println("Enter second number:");
        int num2 = scan.nextInt();

        System.out.println("Enter third number:");
        int num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3) {
            if (num2 > num3) {
                medium = num2;
            } else {
                medium = num3;
            }

        } else if (num2 > num1 && num2 > num3) {
            if (num1 > num3) {
                medium = num1;
            } else {
                medium=num3;
            }
        } else if (num3 > num1 && num3 > num2) {
            if(num1> num2){
                medium = num1;
            }else {
                medium = num2;
            }
        }
        System.out.println("Medium value is: "+medium);

    }


}

/*
Write a program that will return mid number out of three numbers. No need to do any calculations.

Create an object of Scanner class.

Declare int 3 variables: num1, num2, num3.

Example:

Enter first number:
14
Enter second number:
52
Enter third number:
25

Medium value is: 25

Copied!
Enter first number:
140
Enter second number:
34
Enter third number:
1

Medium value is: 34
 */