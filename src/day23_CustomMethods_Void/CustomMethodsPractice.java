package day23_CustomMethods_Void;

public class CustomMethodsPractice {
    // create a function that can print hello world 5 times ==> helloWorld5Times()
    public static void helloWorld() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }
    }

    public static void helloCydeo(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");
        }
    }

    public static void evenNumbers(){

        for (int i = 2; i <= 10; i+=2) {
            System.out.println(i);
        }
    }


    public static void main(String[] args) {
        helloWorld();
        helloCydeo();
        evenNumbers();
    }

    //create a function that can print all the even numbers from 1~ 10 ==>

}
