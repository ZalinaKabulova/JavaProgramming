package replitTasks;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        String name = inp.nextLine();

        if (name.equals("chen")){
            System.out.println("teacher");
        }else {
            System.out.println("student");
        }

    }
}/*
Write a program for a tip calculator. There will be different service
quality benchmarks that will determine the tip given. There will also the
ability to calculate based on the number of people in the party and if there
is a split of the bill or not.

Poor = 5% Fair = 10% Good = 15% Great = 20% Excellent = 25%

The program should display the following information based on the user input:

Split or No split (Yes or No) Number of people entered: (number)
 (each person = & in output) Check amount: (number) Service Quality:
 (String) Total to pay: Total tip: Total per person: Tip per person:

Example

Input:
Yes
4
476.0
Excellent

Output:
Number of people entered: &&&&
Total to pay: 595.0
Total tip: 119.0
Total per person: 148.75
Tip per person: 29.75
*/

