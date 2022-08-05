package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElements2 {

    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,3};

        numbers = removeElement(numbers,4);  //[1, 2, 3, 4]

        System.out.println(Arrays.toString(numbers));

        System.out.println("-------------------------------------");

        int[] numbers1 = {100,200,300,400,500,600};

        numbers1 = removeElement(numbers1,1); //[100, 300, 400, 500, 600]

        System.out.println(Arrays.toString(numbers1));
    }


    public static int[] removeElement(int[] array, int index) {  // index which I want to remove


        if(index < 0 || index > array.length){
            System.err.println("Invalid index");
            System.exit(0);
        }

        int[] result = {};

        for (int i = 0; i < array.length; i++) {  // i: array's index number

            if (i != index) {  // if the index is not 4
                result = ArraysUtility.addElement(result, array[i]);
            }
        }
        return result;
    }
}



