package day01_JavaIntro;

import day24_CustomMethod_Return.ReturnMethodIntro;
import day24_CustomMethod_Return.ReturnMethodsPractice4NOT;
import day25_CustomMethods_Overloading.day25_CustomMethods_Overloading.AddElementsToArray;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        String str = "aaaabbbbbbccccc";

        str = ReturnMethodsPractice4NOT.removeDuplicates(str);

        System.out.println(str);

        System.out.println("-------------------------------");

        String name = "Java Programming";

        String reversedName = ReturnMethodIntro.reverse(name);

        System.out.println(reversedName);

        System.out.println("-------------------------------------");

        String[] names = {"Zalina","Amina"};

        String[] array = AddElementsToArray.addString(names,"Hatice");

        System.out.println(Arrays.toString(array));

        System.out.println("----------------------------------------");


    }


}
