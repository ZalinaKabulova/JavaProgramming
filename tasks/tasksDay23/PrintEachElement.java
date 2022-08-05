package tasksDay23;
import java.util.Scanner;
public class PrintEachElement {


    public static class Tasks {

        public static void main(String[] args) {
            int[] arr = {1, 5, 9, 10, 89};
            printEachElement(arr);
        }

        public static void printEachElement(int[] arr) {
            for (int elements : arr) {
                System.out.print(elements + " ");
            }
        }


    }
}

