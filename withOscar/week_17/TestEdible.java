package week_17;

public class TestEdible {


    public static void main(String[] args) {

        int a = 12;
        System.out.printf("%03d", a); //prints 012

        method('M',"Sister");

    }
    public static int method(char c, String s){
         int n = -5;

        for (int i = 1; i < 5; i++) {
            n *= i;
        }
        System.out.println(n);
        return n;
    }

}
