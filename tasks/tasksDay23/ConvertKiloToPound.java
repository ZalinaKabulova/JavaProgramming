package tasksDay23;

public class ConvertKiloToPound {

    public static void main(String[] args) {

        kiloToPound(100);

    }
//11. create a method that can convert kg to lb
    public static void kiloToPound(double amountOfKilo){

        double lb= amountOfKilo * 2.20;

        System.out.println(amountOfKilo + " kg is equal to "+lb+" pounds");

    }
}
