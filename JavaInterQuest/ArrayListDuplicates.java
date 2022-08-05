import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDuplicates {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(2, 3, 4, 5, 2, 3, 4, 5, 2, 3, 4, 5));

        System.out.println(list);

        ArrayList<Integer> newList = new ArrayList<>();


        for (Integer each : list) {
            if (newList.contains(each)) {
                continue;
            }
            newList.add(each);
        }
        System.out.println(newList);

        //static {//class can be static if it is nested class and the inner class is static as well
    }   // variables
       //  methods
       //blocks
    //class     see day 34 Static Members
}
