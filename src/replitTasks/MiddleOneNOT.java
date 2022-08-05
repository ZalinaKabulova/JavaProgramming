package replitTasks;

import java.util.Scanner;

public class MiddleOneNOT {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        if(word.length()==1)
        {
            System.out.println(Character.toString(word.charAt(0))
                    + Character.toString(word.charAt(0))
                    + Character.toString(word.charAt(0)));
        }
        else if(word.length()==2)
        {
            System.out.println(Character.toString(word.charAt(0))
                    + Character.toString(word.charAt(1))
                    + Character.toString(word.charAt(0))
                    + Character.toString(word.charAt(1)));
        }
        else if(word.length()>=3 && word.length()%2==1)
        {
            System.out.println(Character.toString(word.charAt(word.length()/2)));
        }
        else if(word.length()>=4 && word.length()%2==0)
        {
            System.out.print(Character.toString(word.charAt(word.length()/2-1))
                    + Character.toString(word.charAt(word.length()/2)));
        }

    }
}
