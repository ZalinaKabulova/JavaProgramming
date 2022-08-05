package tasksDay14;

import java.util.Scanner;

public class EndWithLy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scan.next();
        scan.close();

        String lastTwoChars = word.substring(word.length()-2);

        if(lastTwoChars.equals("ly")){
            System.out.println("Really?");
        }else {
            System.out.println("Never mind");
        }
    }
}
