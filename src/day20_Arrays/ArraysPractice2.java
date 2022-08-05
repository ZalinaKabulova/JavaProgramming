package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {

    public static void main(String[] args) {

        char[] letters = new char[26];

        /*letters[0] = 'A';
        letters[1] = 'B';
*/
        /*for (int i = 0, j ='A'; i < letters.length; i++, j++) {
            letters[i] = (char) j;
        }

         */
       char ch = 'A';
        for (int i = 0; i < letters.length; i++) {
            letters[i] = ch;
            ch++;
        }
        System.out.println(Arrays.toString(letters)); // [A~Z]

        System.out.println("-------------------------------------");




    }
}
