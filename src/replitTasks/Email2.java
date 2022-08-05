package replitTasks;

import java.util.Scanner;

public class Email2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String email1 = "Cydeo.School@yandex.kz";

        int beginningIndex = email.indexOf("@") + 1;
        int endingIndex = email.lastIndexOf(".");


        String firstName = email.substring(0, email.indexOf("."));
        String domain = email.substring(beginningIndex, endingIndex);
        String lastname = email.substring(email.indexOf(".")+1, email.lastIndexOf("@"));

        System.out.println("First name: " + firstName);
        System.out.println("Last name: "+lastname);
        System.out.println("Domain: "+domain);

    }
}
