package tasksDay14;



public class EmailTask1 {
    public static void main(String[] args) {

        String account = "mike_tyson@gmail.com";

        String firstname = account.substring(0,account.indexOf("_"));
        String lastName = account.substring(account.indexOf("t"),account.lastIndexOf("@"));
        String rest = account.substring(account.lastIndexOf("@"));

        System.out.println(firstname);
        System.out.println(lastName);
        System.out.println(rest);

        account = lastName+"_"+firstname+rest;
        System.out.println(account);
    }

}/*
 Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name
       and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email
        (Seperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com


*/
