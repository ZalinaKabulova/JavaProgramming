package day11_Switch_Scanner;

public class DaysInWeek {

    public static void main(String[] args) {

        int number = 9;

        switch (number) {// ==
            case 1:
                System.out.println("Monday");
                break; //exits the switch after executing the case block

            case 2:
                System.out.println("Tuesday");
                break; //exits the switch after executing the case block

            case 3:
                System.out.println("Wednesday");
                break; //exits the switch after executing the case block
            case 4:
                System.out.println("Thursday");
                break; //exits the switch after executing the case block
            case 5:
                System.out.println("Friday");
                break; //exits the switch after executing the case block
            case 6:
                System.out.println("Saturday");
                break;//exits the switch after executing the case block
            case 7:
                System.out.println("Sunday");
                break; //exits the switch after executing the case block
            default: //only gets executed of none of the case blocks are matching
                System.out.println("Not a valid day");
                break;// we do not need to give break statement for
                     // the last block of the switch in order to exit the switch


        }


    }
}
