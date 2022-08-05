package tasksDay23;

public class convertDollarToEuro {

    public static void main(String[] args) {

        dollarToEuro(455);

    }
    //9. create a method that can convert dollar to euro
    public static void dollarToEuro(double amountOfDollar){

        double euro = amountOfDollar* 1.13;

        System.out.println(amountOfDollar +" dollar is equal to "+euro+" euro");
    }
}
