package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {  // i: index numbers of list
            list.set(i,list.get(i) * 2);
        }

        System.out.println(list);


        System.out.println("----------------------------------------------");

        ArrayList<String> employees = new ArrayList<>();

        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

        System.out.println(employees);

       employees.remove(0);  //remove(int index): removes the element at the given index
        // [Suat, Aygun, Olga, Neira, Ali, Hulya, Kaloyan]  and after the method
        // [Aygun, Olga, Neira, Ali, Hulya, Kaloyan]

        System.out.println(employees);

        employees.remove(1); //[Aygun, Neira, Ali, Hulya, Kaloyan]

        System.out.println(employees);

        employees.remove(employees.size()-1);

        System.out.println(employees);

        employees.remove("Hulya"); //remove(Object): removes the given object from arraylist,
                                     // returns boolean [Aygun, Neira, Ali] with multiple
                                     // objects removes only the first object

        System.out.println(employees);

        employees.remove("Neira"); //[Aygun, Ali]

        System.out.println(employees);

       boolean r1 =  employees.remove("Ali"); //[Aygun]

        System.out.println(employees);

        boolean r2 = employees.remove("Aygun"); //[ ]

        System.out.println(employees);

        System.out.println("r2 = " + r2);
        System.out.println("r1 = " + r1);

        System.out.println("-------------------------------");

        System.out.println(list.size());

        list.clear();   //clear(): remove all the elements of the arraylist, size will be 0

        System.out.println(list);




    }
}
/*
{1,2,3,4,5,6}

{2,4,6,8,10,12}
 */