package day24_CustomMethod_Return;

public class Return_vs_ExitMethod {

    public static void main(String[] args) {

        nameOfMonth(59);

        System.out.println("Hello world");
    }
    public static void nameOfMonth(int number) { //95

        if (number < 1 || number > 12) {
            System.out.println("Invalid");
            return; // exists nameOfMonth method
            //System.exit(0); //exits all program
        }

        String name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar" : (number == 4) ? "Apr" : (number == 5) ? "May"
                : (number == 6) ? "Jun" : (number == 7) ? "Jul" : (number == 8) ? "Aug" : (number == 9) ? "Sep" : (number == 10) ? "Oct"
                : (number == 11) ? "Nov" : "Dec";

        System.out.println("Month name = " + name);
    }
}
