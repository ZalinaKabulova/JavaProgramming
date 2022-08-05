package tasksDay28;

import java.util.ArrayList;
import java.util.Arrays;

public class SetLastElement {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
      /*
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        list.set(4,0); //тут меняем 5й элемент на 0 указывая сначало на индекс меняющегося элемента

        System.out.println(list);
*/
        //Bulk operation from Arrays Utility class
        list.addAll(Arrays.asList(1,2,3,4,5));  //adding multiple elements at once by using bulk operation

        System.out.println(list);

        list.set(list.size()-1,0);

        System.out.println(list);



    }
}
/*
1. write a program that can set the last element of the Integer arraylist to zero
	            ex:
	                list = [1,2,3,4,5];
	                output: [1,2,3,4,0];

 */