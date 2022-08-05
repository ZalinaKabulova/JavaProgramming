package tasksDay13;

import java.util.Scanner;

public class FirstLastCharSame {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String str1 = scan.next();

        scan.close();

        char firstChar = str1.charAt(0),
                lastChar = str1.charAt(str1.length()-1);


        if(firstChar==lastChar){
            System.out.println("same");
        }else {
            System.out.println("Different first and last characters");
        }



    }
}
/*
write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
 */