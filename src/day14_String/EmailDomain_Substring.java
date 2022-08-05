package day14_String;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EmailDomain_Substring {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Write the domain of the email");
        String word = input.nextLine();

        String email = "Cydeo.School@gmail.com";

        //String domain = email.substring(13, email.indexOf(".c"));

        int beginningIndex = email.indexOf("@") + 1;
        int endingIndex = email.lastIndexOf(".");

        String domain = email.substring(beginningIndex, endingIndex);

        System.out.println(domain); //gmail

        System.out.println("------------------------------");

        String str1 = "Java is fun, Java is cool, I love Java";
        //             0123456789
        //
        //String s5 = str1.substring(0,3 )+1;
        //System.out.println(s5);
        String s1 = str1.substring(0, 10 + 1);  // Java is fun

        int beg = str1.indexOf(" J") + 1;
        int end = str1.lastIndexOf(",");

        String s2 = str1.substring(beg, end);  //Java is cool


        String s3 = str1.substring(str1.lastIndexOf("I"));

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


    }
}
