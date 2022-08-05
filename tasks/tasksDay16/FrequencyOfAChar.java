package tasksDay16;

import java.util.Scanner;

public class FrequencyOfAChar {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a String and a Char");
        String str = scan.nextLine();
        char ch = scan.next().charAt(0);
         int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);

            if(eachChar== ch){
                frequency ++;
            }
            
        }
        System.out.println(frequency);
        scan.close();
    }
}
