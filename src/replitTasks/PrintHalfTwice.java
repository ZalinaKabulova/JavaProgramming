package replitTasks;

import java.util.Scanner;

public class PrintHalfTwice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        int stringLength=word.length();
        String tmp="";

        for (int s = 0; s < stringLength/2; s++) {
            tmp+= word.valueOf(word.charAt(s));
        }
        //System.out.println(tmp);

        for (int i = 0; i < stringLength/2; i++) {
            tmp+= word.valueOf(word.charAt(i));
        }
        System.out.println(tmp);
    }
}
