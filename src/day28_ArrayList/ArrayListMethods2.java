package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);

        /* int num = 1;
           list.remove(num);     ====>  [100, 200, 200, 300, 400, 500]
        */

        Integer num = 2000;  //false
        //list.remove(200);  //[100, 200, 200, 300, 400, 500]

        boolean r =list.remove(num);//remove(int index): removes the element at the given index
                                     //remove(Object): removes the given object from arraylist, returns boolean

        System.out.println(list);
        System.out.println(r);

        System.out.println("---------------------------");

        System.out.println(list.size());

        list.clear();

        System.out.println(list.size());

        System.out.println(list);

        System.out.println("-----------------------------------------");

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

       int a = characters.indexOf('A');  //0
       int b = characters.lastIndexOf('A');  //4

        System.out.println(a);
        System.out.println(b);

        System.out.println("---------------------------");

        boolean r2 = characters.contains('A');
        boolean r3 = characters.contains('Z');

        System.out.println("r3 = " + r3); //false
        System.out.println("r2 = " + r2); //true

        System.out.println("---------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1==list2);  //false

        System.out.println(list2.equals(list1));  //equals(ArrayList): returns true if two arraylists
                                                  // are equal (same elements in same order),
                                                  //otherwise returns false

        System.out.println("-----------------------------------------------------");


        boolean r4 = list1.isEmpty(); //false because list1 is not empty, there are still elements

        list1.clear();  //clean all the elements in list1

        boolean r5 = list1.isEmpty(); //true

        System.out.println("r4 = " + r4);
        System.out.println("r5 = " + r5);






    }
}
