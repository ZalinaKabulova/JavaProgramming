package tasksDay14;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter your account");
        String account = scan.nextLine();
        scan.close();


        String firstName = account.substring(account.indexOf('0'),account.lastIndexOf("_"));
        String secondName = account.substring(account.indexOf("_")+1,account.lastIndexOf("@"));
        String domain = account.substring(account.indexOf("@")+1,account.lastIndexOf("."));

        System.out.println(firstName);
        System.out.println(secondName);
        System.out.println(domain);
    }
}/*Ex:input:
            craig_federighi@apple.com
              Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple
Create a class called EmailTask2.
       Assume that email address is constructed by person's first
       name and followed by an underscore and last name.

       Write a program that will print out information about user
       based on email. Print first name, last name, and domain.

       First and Last name should be printed with proper format -
       uppercase first letter and remaining lowercase.





*/
