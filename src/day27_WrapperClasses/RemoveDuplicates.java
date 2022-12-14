package day27_WrapperClasses;

import day25_CustomMethods_Overloading.day25_CustomMethods_Overloading.AddElementsToArray;
import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {
    //НУЖНО ПОМЕНЯТЬ МЕТОД ТОЕСТЬ ПЕРЕПИСАТЬ МЕТОД С 26ГО ДНЯ

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4};

        arr = removeDuplicates(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println("------------------------------------------");

        String[] words = {"Java", "Java", "Python", "C#", "Java", "Java"};

        words = RemoveDuplicates.removeDuplicates(words);

        System.out.println(Arrays.toString(words));

        System.out.println("------------------------------------------");

        int[] numbers = {1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,5,5,5};

        // numbers = Arrays.stream(numbers).distinct().toArray();

        // System.out.println(Arrays.toString(numbers));


    }


    //removes the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int[] array) {

        int[] result = {};

        for (int each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = AddElementsToArray.addInteger(result, each);
            }

        }
        return result;
    }

    public static char[] removeDuplicates(char[] array) {

        char[] result = {};

        for (char each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = AddElementsToArray.addChar(result, each);
            }

        }
        return result;
    }


    public static double[] removeDuplicates(double[] array) {

        double[] result = {};

        for (double each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = AddElementsToArray.addDouble(result, each);
            }

        }
        return result;

    }


    public static String[] removeDuplicates(String[] array) {

        String[] result = {};

        for (String each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = AddElementsToArray.addString(result, each);
            }

        }
        return result;

    }

}
