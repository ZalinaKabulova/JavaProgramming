package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Enter your building number");
        String buildingNumber = input.next();

        input.nextLine();

        System.out.println("Enter your Street name");
        String streetName = input.nextLine();

        System.out.println("Enter your city name");
        String cityName = input.next();

        input.nextLine();

        System.out.println("Enter your state");
        String state = input.next();

        System.out.println("Enter your zip code");
        String zipcode = input.next();

        input.close();

    }
}
/*
1. Enter your full name ( nextLine() )
2. Enter your building number ( next() )
3. Enter your Street name ( nextLine() )
4. Enter your city name ( nextLine() )
5. Enter your state ( nextLine() )
6. Enter your zip code ( next() )
Display the shipping address
John Smith
7925 Jones Branch Dr
McLean, VA 22012
 */