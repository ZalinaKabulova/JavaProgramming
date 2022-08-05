package day18_NestedLoop;

public class DivideTwoNumbersNOTE {
    public static void main(String[] args) {

        int a = 30;
        int b = 7;

        int count = 0;
        int remainder = a % b;

        while (a >= b){
            a -= b;
            count++;
        }
        System.out.println(count+ " with a remainder of "+a);

    }
}
