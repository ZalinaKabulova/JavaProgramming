package tasksDay13;

import java.util.Scanner;

public class initial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scan.next();

        System.out.println("Enter your second name");
        String secondName = scan.next();

        scan.close();

        System.out.println(firstName.charAt(0)+"."+secondName.charAt(0));
    }
}
