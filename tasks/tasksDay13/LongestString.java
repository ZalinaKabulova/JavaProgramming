package tasksDay13;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first String of text");
        String str1 = scan.nextLine();

        System.out.println("Enter your second String of text");
        String str2 = scan.nextLine();

        scan.close();

        if (str1.length() > str2.length()){
            System.out.println(str1);
        } else if (str2.length() > str1.length()) {
            System.out.println(str2);
        }else {
            System.out.println("Both are equal");
        }
    }
}
