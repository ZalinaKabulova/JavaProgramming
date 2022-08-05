package replitTasks;

import java.util.Arrays;
import java.util.Scanner;

public class SplitEmail {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        if(email.indexOf("@") == -1 || email.indexOf("@") != email.lastIndexOf("@"))
        {
            System.out.println("invalid email");
        }
        else
        {
            System.out.println("Email id: " + email.substring(0, email.indexOf("@"))) ;
            System.out.println("Email domain: " + email.substring(email.indexOf("@")+1));
        }


    }
}
/*
Given a String variable email, write code using split method to print email id and domain in separate lines.

Example:

email -> info@cybertekschool.com

Output:
Email id: info
Email domain: cybertekschool.com
If email contains no @ character or multiple @ characters then print invalid email:

email -> hello-gmail.com

Output:
invalid email
email -> my@fancy@email.com

Output:
invalid email
 */