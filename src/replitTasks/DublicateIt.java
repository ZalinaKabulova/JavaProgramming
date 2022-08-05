package replitTasks;

import java.util.Scanner;

public class DublicateIt {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE
        System.out.println(word1+word2+word2+word1);

        String s = "Strings are immutable";
        s = s.concat(" all the time");
        System.out.println(s);
    }
}
   // You have 2 words

    //    Print the first word, second word, second word, first word

       // Input:

       // one

       // two
        //Output:

      //  onetwotwoone

