package replitTasks;
import java.util.*;
public class ConsoleMenu {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES.
        Scanner s = new Scanner(System.in);

        System.out.println("---------------");
        System.out.println("select an option:");
        System.out.println("1) option 1");
        System.out.println("2) option 2");
        System.out.println("3) option 3");
        System.out.println("---------------");

        int choice = s.nextInt();
        s.close();

        if(choice==1){
            System.out.println("user selected 1");
        } else if (choice ==2) {
            System.out.println("user selected 2");
        } else if (choice ==3) {
            System.out.println("user selected 3");
        }
        /*
        if choice is 1
print:
user selected 1

if choice is 2
print:
user selected 2

if choice is 3
print:
user selected 3
         */
}}
