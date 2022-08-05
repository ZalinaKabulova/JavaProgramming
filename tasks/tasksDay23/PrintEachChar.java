package tasksDay23;

import day02_HelloWorld.HelloCydeo;

public class PrintEachChar {

    public static void main(String[] args) {

printEachChar("Hello");
    }

    public static void printEachChar(String str){

        for (int i = 0; i < str.length(); i++) {

            System.out.print(str.charAt(i)+" ");
        }

    }
}
