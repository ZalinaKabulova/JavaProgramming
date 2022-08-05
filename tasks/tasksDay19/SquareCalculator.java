package tasksDay19;

import java.util.Scanner;

public class SquareCalculator {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        while(true) {

            System.out.println("Enter the side of the square:");
            double side = scan.nextDouble();

            if (side <= 0) {
                System.out.println("Invalid Entry");
                System.exit(0);
            }
             double area = side*side;
            double perimeter = 2*(side+side);

            System.out.println("area "+ area);
            System.out.println("perimeter "+ perimeter);

            System.out.println("Would you like to calculate another Square");
            String a = scan.next().toLowerCase();

            while (!(a.equals("yes") || a.equals("no"))) {
                System.err.println("Invalid Entry, please re-enter! ");
                a = scan.next();
            }
            if(a.equals("no")){
                System.out.println("Thank you for using Cydeo square calculator app!");
                break;
            }

        }
        scan.close();
    }
}
