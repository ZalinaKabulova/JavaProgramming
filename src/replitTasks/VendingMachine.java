package replitTasks;

import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {
        //ENTER CODE HERE
        Scanner input = new Scanner(System.in);
        int quarters, dimes, nickels, pennies;
        System.out.println("Enter cents:");
        int cents = input.nextInt();

        input.close();
        if (cents > 0 && cents < 100) {
            quarters = cents / 25;
            dimes = (cents - (quarters * 25)) / 10;
            nickels = (cents - ((quarters * 25) + (dimes * 10))) / 5;
            pennies = cents - ((quarters * 25) + (dimes * 10) + (nickels * 5));
            System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + pennies + " pennies");
        } else {
            System.out.println("Invalid cents amount");
        }
/*
int cents;
        int quarters; //25 cents
        int dimes; //10 cents
        int nickles; //5 cents
        int pennies; //1 cent

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter cents:");
        cents=scan.nextInt();

        if(cents<0 || cents>100)
        {
            System.out.println("Invalid cents amount");
        }
        else
        {
            quarters= cents / 25;
            dimes= (cents % 25) / 10;
            nickles= ((cents % 25) % 10) / 5;
            pennies= ((cents % 25) % 10) % 5;


            System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, " + nickles + " nickels, and " + pennies + " pennies");
        }
 */
    }
}