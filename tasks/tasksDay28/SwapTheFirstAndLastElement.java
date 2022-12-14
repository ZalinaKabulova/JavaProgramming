package tasksDay28;

import java.util.ArrayList;
import java.util.Arrays;

public class SwapTheFirstAndLastElement {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5)); // adding multiple elements at once by using bulk operation



        int temp = list.get(0);// 1


        list.set(0, list.get(list.size()-1)); //[5, 2, 3, 4, 5]

        list.set(list.size()-1, temp); //[5, 2, 3, 4, 1]

        System.out.println("list = " + list);


    }
}
/*
write a program that can swap the first and last elements of an integer arraylist
	            ex:
	                list = [1,2,3,4,5];
	                output: [5,2,3,4,1];

 */