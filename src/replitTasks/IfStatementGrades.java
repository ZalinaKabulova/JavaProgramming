package replitTasks;

import java.util.*;

public class IfStatementGrades {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner s = new Scanner(System.in);

        int grade = s.nextInt();
        s.close();
        String result;

        if (grade >= 90) {
            result = "excellent";

        } else if (grade >= 70 && grade < 90) {
            result = "good";
        } else if (grade >= 60 && grade < 70) {
            result = "pass";
        } else {
            result = "fail";
        }
        System.out.println(result);

    }

}

/*
Write a program that takes the grade int and prints if it's a passing grade or failure.

if grade is bigger than 90 output "excellent"
if the grade is bigger than 70 and smaller then 90 output "good"
if grade is bigger than 60 and smaller than 70 output "pass"
if grade is smaller than 60 output "fail"
Examples:

93

excellent
46

fail
80

good
 */
