package day16_ForLoopStringPractice;

public class Palindrome {
    public static void main(String[] args) {
        
        String word = "Cydeo";
        //             01234
        String reversed = "";

        for (int i = word.length() -1; i >= 0 ; i--) {
            reversed += word.charAt(i);
        }
        System.out.println(reversed);

        boolean isPalendrome = word.equalsIgnoreCase(reversed);

        System.out.println("Is Palendrome? "+isPalendrome);
    }
}
/*
Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true


 */