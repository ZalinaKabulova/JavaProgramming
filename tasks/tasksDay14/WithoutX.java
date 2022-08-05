package tasksDay14;

import java.util.Scanner;

public class WithoutX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scan.next();

        scan.close();

        if(word.charAt(0)=='x'){
            word = word.substring(1);
        }
        System.out.println(word);


    }
}
