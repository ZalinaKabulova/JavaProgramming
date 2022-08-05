package replitTasks;

import java.util.Scanner;

public class PrintVowels {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        char isVowel;

        for (int i = 0; i < word.length(); i++) {
            isVowel= word.charAt(i);

            if (isVowel=='a' || isVowel=='e' || isVowel=='o'|| isVowel=='i'||isVowel == 'u'){

                System.out.println(isVowel);

            }


        }
    }
}
