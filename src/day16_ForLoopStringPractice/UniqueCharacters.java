package day16_ForLoopStringPractice;

public class UniqueCharacters {

    public static void main(String[] args) {
        String str = "aaabccc";

        String result = ""; //abc

        for (int i = 0; i < str.length(); i++) { //or for (int i = 0; i <= str.length()-1; i++)
        // here i represents all the index numbers of str(start from 0)

            char ch = str.charAt(i); // represents each Character of str
            //System.out.print(ch+" "); //a a a b c c c b
            //        0        ==   2
            if (!result.contains(ch+"")) { // if the character is not contained in the result
                result += ch;

            }


        }
        System.out.println(result);


    }
}
/*
Write a program that can return the unique characters from a String
			Ex:
				input:
					AABCCD
				output:
					BD
			Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique
 */

