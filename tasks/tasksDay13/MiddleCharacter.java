package tasksDay13;

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your word");
        String word = scan.next();
        scan.close();

        if(word.length()==3){
        if(word.charAt(1)=='a'){
            System.out.println("Cool word");
        }else{
            System.out.println("Okay word");
        }
        }else{
            if(word.length()< 3){
                System.out.println("Word is too short");
            }else {
                System.out.println("Word is too long");
            }
        }
        }
    }
            /*if(word.length() > 3 ){
                System.out.println("Word is too long");
            }else{
                System.out.println("Word is too short");
            }
        }
                System.out.println("Cool word");
            }else {
                System.out.println("Okay word");
            } if(word.length()< 3){
                System.out.println("Word is too short");

            }else {
                System.out.println("Word is too long");
            }

        }*/
        /*if(word.length() == 3){
            if(word.charAt(1) == 'a'){
                System.out.println("Cool word");
            }else{
                System.out.println("Okay word");
            }
        }else{
            if(word.length() > 3 ){
                System.out.println("Word is too long");
            }else{
                System.out.println("Word is too short");
            }
        }*/



