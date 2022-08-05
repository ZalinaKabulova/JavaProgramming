package tasksDay14;

import java.util.Scanner;

public class AddTwoWords1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a first word");
        String word = scan.next();

        System.out.println("Enter a second word");
        String word1 = scan.next();

        if (word.charAt(word.length()-1)==word1.charAt(0)) {
            System.out.println(word+ word1.substring(1));
        }else {
            System.out.println(word+", "+word1);
        }
    }
}
