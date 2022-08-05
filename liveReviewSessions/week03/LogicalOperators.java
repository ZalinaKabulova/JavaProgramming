package week03;

public class LogicalOperators {
    public static void main(String[] args) {
        int A = 20;
        int O = 30;
        int P = 30;

        boolean comp = A < O || --O >= P; // true|| false; Logical OR if the first Expression is True  It does not compile the second part of OR operator

        System.out.println("comp = " + comp);
        System.out.println("O = " + O);

        // Interview Question asked, trickly

        boolean compTwo = A > O || O-- >= P; // false || true : from the next step O becomes 29

        System.out.println("compTwo = " + compTwo);
        System.out.println("O = " + O); //29



    }
}
