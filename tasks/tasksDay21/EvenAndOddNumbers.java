package tasksDay21;

import java.util.Arrays;

public class EvenAndOddNumbers {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        int countOdd = 0;
        int countEven = 0;

        for (int each : arr) {
            if(each%2==0){
                countEven++;
            }else {
                countOdd++;
            }
        }

        System.out.println(Arrays.toString(arr)+" has "+countEven+ " even number and "+countOdd +" odd number");

    }
}
