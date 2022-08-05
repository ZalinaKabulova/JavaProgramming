package tasksDay12;

import java.util.Scanner;

public class NumberOfPeople {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        int num1 = input.nextInt();

        input.close();

        String result = "";

        if(num1 < 3){
            result = "Live with less than 3 people";
        }else if(num1<=6){
            result = "Live with 3 - 6 people";
        }else{
            result = "Live with more than 6 people";
        }

        System.out.println(result);


    }
}
