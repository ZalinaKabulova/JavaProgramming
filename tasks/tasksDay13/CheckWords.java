package tasksDay13;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter your first word");
        String word1 = scan.next();

        System.out.println("Please, enter your second word");
        String word2 = scan.next();

        System.out.println("Please, enter your third word");
        String word3 = scan.next();
        scan.close();

        if (word1.length()==word2.length() && word2.length()==word3.length()){
            System.out.println("All words are same length");
        } else if (word1.length()==word2.length()) {
            System.out.println("Not Same nor Different lengths");
        } else if (word1.length()==word3.length()) {
            System.out.println("Not Same nor Different lengths");
        } else if (word2.length()==word3.length()) {
            System.out.println("Not Same nor Different lengths");
        }else {
            System.out.println("All different length");
        }


    }
}/*
Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
*/
