package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {
        int a, b, c;
        a = 10;
        b = 15;
        c = 20;
        /* if we have three different numbers, one must maximum,
        one must be minimum number
        and one must be Median
         */
        boolean aIsMedian = (a > b && a < c) || (a > c && a < b);
        /*
        in order for B to be the median number:
        1. if C is the maximum number & A is the minimum number,
        then B is the median number
         */
        boolean bIsMedian = (b > a && b < c) || (b > c && b < a);
        boolean cIsMedian = (c > a && c < b) || (c > b && c < a);
                            //or !aIsMedian && !bIsMedian;
        if(aIsMedian){
            System.out.println(a+ " is the median number");
        }
        if(bIsMedian){
            System.out.println(b+ " is the median number");
        }
        if(cIsMedian){
            System.out.println(c+ " is the median number");
        }

    }
}
/*
Create a class called MedianNumber. write a program that can find
the median number between three DIFFERENT given integers
Ex: a = 10, b= 15, c = 20;
Output:15 is the median number
Posibility #1: a could be median number
Posibility #2: b could be median number
Posibility #3: c could be median number
*/