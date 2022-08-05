package tasksDay23;

public class PositiveNegativeOrZero {

    public static void main(String[] args) {

        positiveNegativeOrZero(0);
    }

    public static void positiveNegativeOrZero(int number){

        if (number > 0 ){
            System.out.println("Positiv number");
        } else if (number < 0) {
            System.out.println("Negativ number");
        }else {
            System.out.println("Number is zero");
        }
    }
}
