package tasksDay13;

import java.util.Scanner;

public class FirstLastCharactersOfSentence {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Please, enter the sentence");
        String sentence = scan.nextLine();

        scan.close();

        char firstChar = sentence.charAt(0);
        char lastChar = sentence.charAt(sentence.length()-1);
        String result = firstChar + "" + lastChar;

        System.out.println(result);

    }
}
/*
 write a program that asks user to enter a sentence.
 then print the first & last characters of the sentence

 */
