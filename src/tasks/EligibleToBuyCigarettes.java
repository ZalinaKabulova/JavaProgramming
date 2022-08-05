package tasks;

public class EligibleToBuyCigarettes {
    public static void main(String[] args) {

        byte age = 18;

        boolean eligible = age >=21;

        if(eligible){
            System.out.println("Eligible to buy cigarettes.");
        }
        if(!eligible){
            System.out.println("Not eligible to buy cigarettes.");
        }
    }


}
