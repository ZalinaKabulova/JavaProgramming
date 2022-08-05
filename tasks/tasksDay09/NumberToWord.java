package tasksDay09;

public class NumberToWord {
    public static void main(String[] args) {

        int number = 5; // 1~ 9
        String result = "";

        if (number==0){
            result = "zero";
        } else if (number==1) {
           result = "one";
        }else if (number==2) {
        result = "two";
        } else if (number==3) {
            result = "three";
        } else if (number==4) {
            result = "four";
        }else if (number==5) {
            result = "five";
        }else if (number==6) {
            result = "six";
        } else if (number==7) {
            result = "seven";
        } else if (number==8) {
            result = "eight";
        }else {
            result = "nine";

        }
        System.out.println("result = " + result);

        }}


/*
 Create a class called NumberToWord, and write a java program that can
 convert numbers between 0 ~ 9 to words
Ex:number = 1;
output:One
*/