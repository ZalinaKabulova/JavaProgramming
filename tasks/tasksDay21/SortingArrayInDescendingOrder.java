package tasksDay21;

import java.util.Arrays;

public class SortingArrayInDescendingOrder {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};

        int[] result = new int[arr.length];
        //System.out.println(Arrays.toString(result));

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            result[j]= arr[i];
        }

        System.out.println(Arrays.toString(result));


    }
}

//1. Write a program that sort the array of integer in descending order