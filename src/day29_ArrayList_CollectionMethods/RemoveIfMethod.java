package day29_ArrayList_CollectionMethods;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    // remove method can not be run with FORI loop,but can run with FOR loop
    // removeIf method can not be run with FOR loop,but can run with FORI loop
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        //[1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9]




       /* for (int i = 0; i < list.size(); i++) {
            if(list.get(i) %2 != 0 ){
                list.remove(i);  //[2, 4, 6, 8, 1, 2, 4, 6, 8, 1, 2, 4, 6, 8]
            }
        }
       */

        list.removeIf( p -> p < 5); //it calls LAMBDA EXPRESSION [5, 6, 7, 8, 9, 5, 6, 7, 8, 9, 5, 6, 7, 8, 9]
                                    //removed all numbers which are less than 5
        System.out.println(list);

        System.out.println("---------------------------------------------");

        ArrayList<Integer>list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        list2.removeIf(each -> each % 2 == 0); //removed all even numbers [1, 3, 5, 7, 9]

        System.out.println(list2);

        System.out.println("-------------------------------------");

        ArrayList<String> list3 = new ArrayList<>();

        list3.addAll(Arrays.asList("Java", "Python", "JavaScript", "C#", "C++", "Java", "Java"));

        list3.removeIf(p -> p.startsWith("J")); //[Python, C#, C++]

        System.out.println(list3);

        System.out.println("------------------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna", "Racecar", "Level", "Eye", "Java", "Python", "Cydeo"));

        names.removeIf(name -> !StringUtility.isPalindrome(name)); // method isPalindrome is used from String Utility

        System.out.println(names); //[Anna, Racecar, Level, Eye]






    }


}
