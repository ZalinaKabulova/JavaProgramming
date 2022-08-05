package replitTasks;

import java.util.Scanner;

public class LaptopConfiguration {
    public static void main(String[] args) {

        double price = 0;
        String storageType, screenType,cpu;
        int ram = 0;
        double screenSize = 0.0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Select screen size:");
        double size = scan.nextDouble();

        System.out.println("Select CPU type:");
        cpu = scan.next();

    }
}
