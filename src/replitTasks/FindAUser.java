package replitTasks;

import java.util.Scanner;

public class FindAUser {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter full name:");
        String fullName = scan.nextLine().toLowerCase();

        if(fullName.equals("Max Payne") || fullName.equals("Alan Wake")){
            System.out.println("User found!");
        }else {
            System.out.println("User not found! Please make your search case insensitive!");
        }
    }
}
