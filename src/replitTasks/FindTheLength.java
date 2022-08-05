package replitTasks;

import java.util.Scanner;

public class FindTheLength {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the text:");
        String message = scan.nextLine();
        System.out.println("Length is: "+message.length());


    }
}
