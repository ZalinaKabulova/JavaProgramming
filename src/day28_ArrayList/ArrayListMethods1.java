package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        // Autoboxing from Wrapper class (Integer) to primitive datatype
        numbers.add(10); // 0
        numbers.add(20); // 1
        numbers.add(30); // 3
        numbers.add(40); // 4
        numbers.add(50); // 6
        numbers.add(60); // 7

        numbers.add(2, 25); // add Method has function of inserting WITHOUT deleting the old index
        numbers.add(5, 45);


        System.out.println(numbers);
//                                           0   1   2   3   4   5               0   1   2   3   4   5   6
// add Method has function of inserting     [10, 20, 30, 40, 50, 60] =====>>>>> [10, 20, 25, 30, 40, 50, 60]


        System.out.println(numbers.size()); // sizeMethod counts elements in array
        int lastIndex = numbers.size() - 1; // shows the last index in the array "-1"

        System.out.println("last index= " + lastIndex);

        int num = numbers.get(3);  //get(index): returns the element at the given index

        System.out.println("num = " + num);

        System.out.println("---------------------------------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("----------------------------------------");

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        list.set(2, "JavaScript");  // set(index,  Data): replaces the element at given index with the new element.
        list.set(3, "C++");
        System.out.println(list);


    }
}
