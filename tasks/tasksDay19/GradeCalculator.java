package tasksDay19;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Enter your score");
            int score = scan.nextInt();

            if (score < 0 || score > 100) {
                System.out.println("Invalid Entry");
                System.exit(0);
            }
            if (score >= 90 && score <= 100) {
                System.out.println("A");
            } else if (score >= 80 && score <= 89) {
                System.out.println("B");
            } else if (score >= 70 && score <= 79) {
                System.out.println("C");
            } else if (score >= 60 && score <= 69) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
            System.out.println("Would you like to continue?");
            String a = scan.next();

            while (!(a.equals("yes") || a.equals("no"))){
                System.out.println("Invalid Entry, please re-enter!");
                a = scan.next();
            }
            if(a.equals("no")){
                System.out.println("Thank you for using Cydeo grade calculator app!");
                break;
            }
        }
        scan.close();
        }
    }

