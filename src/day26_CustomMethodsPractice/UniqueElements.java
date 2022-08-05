package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {

        int [] array = {1,1,3,3,4,5,6,7,7,7,2,4,6};

        int [] unique = UniqueElements.uniqueElements(array);

        System.out.println(Arrays.toString(unique));


        System.out.println("------------------------------------------");

        double[] array2 = {1.5, 2.5, 1.5, 3.5, 4.5, 4.5, 5.5, 5.5};

        double[] unique1 = UniqueElements.uniqueElements(array2);

        System.out.println(Arrays.toString(unique1));

        System.out.println("------------------------------------------");






    }

   // returns the unique elements of the array
    public static int[] uniqueElements(int[] array) {

        int[] result = {};  //

        for (int each : array) {

            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // if the frequency is one , the element is unique
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


    // returns the unique elements of the array
    public static double[] uniqueElements(double[] array) {

        double[] result = {};  //

        for (double each : array) {

            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // if the frequency is one , the element is unique
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    // returns the unique elements of the array
    public static char[] uniqueElements(char[] array) {

        char[] result = {};  //

        for (char each : array) {

            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // if the frequency is one , the element is unique
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


    // returns the unique elements of the array
    public static String[] uniqueElements(String[] array) {

        String[] result = {};  //

        for (String each : array) {

            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // if the frequency is one , the element is unique
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
}
