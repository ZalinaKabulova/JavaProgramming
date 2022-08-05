package day09_IfStatements;

public class PassOrFailed {
    public static void main(String[] args) {
        int score = 75;
        boolean a = score >= 60;
        if (a) {
            System.out.println("Congrats, you passed");
        } else {
            System.out.println("Failed");

        }
        System.out.println("------------------------OR---------------------");

        /*
        if(score >= 60) {
            System.out.println("Congrats, you passed");
        }else{
            System.out.println("Failed");
        }
         */


    }
}
