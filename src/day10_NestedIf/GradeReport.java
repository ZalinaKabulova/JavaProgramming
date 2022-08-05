package day10_NestedIf;

import jdk.swing.interop.SwingInterOpUtils;

public class GradeReport {
    public static void main(String[] args) {

        int s = 115;
        String report = "";

        if (s >=0 && s <= 100){
            if (s>= 90){
                report = "Excellent";
            } else if (s>= 80) {
                report = "Great";
            }else if (s>= 70) {
                report = "Good";
            }else if (s>= 60) {
                    report = "Passed";
            }else {
                report = "Failed";
            }}else {
            System.out.println("Invalid Score");
        }
        System.out.println(report);
        System.out.println("--------------------------------");



        if(s >= 0 && s <= 100){ // if the s is valid (0 ~ 100 )
            // 5 possibilities: A, B, C, D, F
            if(s>= 90 ){ //false:  s < 90
                System.out.println("Excellent");
            }else if(s >= 80 ){ // false: s < 80
                System.out.println("Great");
            }else if(s >= 70){ // false: s < 70
                System.out.println("Good");
            }else if(s >= 60){// false: s < 60
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }

        }else{ // if the s is NOT valid
            System.out.println("Invalid score");
        }
        System.out.println("-----------------------------------------");

        int score = 5000;

        /*
        if(s >= 0 && s <= 100){
            if(s >= 60){
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }
        }else{
            System.out.println("Invalid Score");
        }
        */
/*
        String result = (s >= 0 && s <= 100) ? (s >= 90) ? "Excellent" : (s >= 80) ? "Great" : (s >= 70) ? "Good"
                : (s >= 60) ? "Passed" : "Failed" : "Invalid Score";
        System.out.println(result);
         */

        System.out.println("-------------------------------------------");
        // solution3: TERNARIES WITH NESTED IF
        String result2 = "";

        if (s >= 0 && s <= 100) { // if the s is valid (0 ~ 100 )

            result2 = (s >= 90) ? "Excellent" : (s >= 80) ? "Great" : (s >= 70) ? "Good" : (s >= 60) ? "Passed" : "Failed";

        } else { // if the s is NOT valid
            result2 = "Invalid Score";
        }

        System.out.println(result2);


         /*
        90 ~ 100: Excellent
        80 ~ 89: Great
        70 ~ 79: Good
        60 ~ 69: Passed
        0 ~ 59: failed
         */


}}
