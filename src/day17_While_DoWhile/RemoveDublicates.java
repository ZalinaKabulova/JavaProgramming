package day17_While_DoWhile;

public class RemoveDublicates {
    public static void main(String[] args) {

        String str = "AABBCC";

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            String ch ="" + str.charAt(i);
            if (result.contains(ch)){   // if the result already contains the character
                continue;
            }

            result += ch;


        }
        System.out.println(result);
    }
}
