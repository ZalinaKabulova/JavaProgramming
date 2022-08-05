package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSentence2 {

    public static void main(String[] args) {

       String sentence = "Java has different versions";

       String[] words = sentence.split(" ");  //[Java, has, different, versions]

        //System.out.println(Arrays.toString(words));

        String reverse = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reverse+= words[i]+ " "; //versions different has Java
        }
        System.out.println(reverse);


    }
}
/*
warmup task:
	1. Write a program that can reverse a sentence
			Ex:
				sentence = "Java has different versions";

			output:versions different has Java

 */