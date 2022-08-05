package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {

        int min = 2147483647;

        Scanner scan = new Scanner(System.in);

        for (int i = 10; i < 15; i++) {
            System.out.println("Enter a number");
            int num = scan.nextInt();

            if(num < min){
                min = num;
            }

        }
        System.out.println("Minimum number = "+min);
    }
}
