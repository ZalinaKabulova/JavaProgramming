package replitTasks;

import java.util.Scanner;

public class VideoGameCoupons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, candy, gumball;
        //WRITE YOUT CODE HERE:
        System.out.println("Enter number of coupons:");
        num=scan.nextInt();

        candy=num/10;
        gumball=(num%10)/3;

        if(candy==0 && gumball==0)
        {
            System.out.println("Not enough coupons");
            return;
        }

        System.out.println("Number of Candies: "+candy);
        System.out.println("Number of Gumballs: "+gumball);

    }
}
