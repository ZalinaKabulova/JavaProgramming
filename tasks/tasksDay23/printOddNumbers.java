package tasksDay23;

public class printOddNumbers {

    public static void main(String[] args) {

        oddNumbers();
        evenNumbers();

    }

    //1. create a method that can print odd numbers between 1~100
    // in a same line separated by space
    public static void oddNumbers(){
        for (int i = 1; i <101 ; i+=2) {

            System.out.print(i+" ");
        }
    }

    public static void evenNumbers(){

        for (int i = 2; i < 101; i+=2) {

            System.out.print(i+" ");

        }
    }


}
