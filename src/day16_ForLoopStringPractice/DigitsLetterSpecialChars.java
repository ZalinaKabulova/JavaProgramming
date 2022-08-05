package day16_ForLoopStringPractice;

public class DigitsLetterSpecialChars {
    public static void main(String[] args) {

        String str = "Cydeo12345School!@#$%WoodenSpoon";

        String digits = "";// 12345
        String letters = ""; //CydeoWoodenSpoon
        String specialChars = ""; //!@#$%

        for (int i = 0; i < str.length(); i++) { // i: index numbers of str (0 ~ last index)

            char ch = str.charAt(i); // ch: each character that we have in str
            System.out.println(ch);
         if (ch >= '0' && ch <= '9'){
             digits += ch;
         } else if (ch >= 'A' && ch <= 'Z') { //if the character is between 'A' to 'Z' then it is letter
             letters += ch;
         } else if (ch >= 'a' && ch <= 'z') { //if the character is between 'A' to 'Z' then it is letter
             letters += ch;
         }else {
             if(ch != ' '){
             specialChars += ch;
             }
         }
         }
        System.out.println("digits = "+digits);
        System.out.println("letters = "+ letters);
        System.out.println("special character = "+ specialChars);
        }
    }

