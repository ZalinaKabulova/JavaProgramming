package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        int max = -2147483648; // any user entered number will be greater than -2147483648
         //для максимальной суммы цифры надо указать миним. сумму ИНТ
        // и наоборот если хотим найти мин сумму надо указать макс. сумму ИНТ

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Enter a number");
            int num = scan.nextInt();

            if(num > max){ // //if the user entered number is greater than current maximum number
                max = num;
            }
        }
        System.out.println("max= "+ max);

    }
}
/*
Write a programm that asks the user to enter a number for 5 times
return the maximum number
 */
