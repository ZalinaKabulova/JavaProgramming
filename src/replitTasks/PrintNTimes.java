package replitTasks;

import java.util.Scanner;

public class PrintNTimes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n ; i++) {

            System.out.print("* ");

        }
    }
}
