package tasksDay23;

public class convertDollarToLira {

    public static void main(String[] args) {

        dollarToEuro(100);

    }
//9. create a method that can can convert dollar to lira
    public static void dollarToEuro(double amountOfDollar){

        double lira = amountOfDollar* 16.82;

        System.out.println(amountOfDollar+" dollar is equal to "+lira+" tl");

    }
}
