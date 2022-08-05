package day15_ForLoop;

public class Alphabet {

    public static void main(String[] args) {

        for (int i = 'A'; i <= 'Z' ; i++) { // OR: for (char i = 'A'; i <= 'Z' ; i++) {

            //мы должны поменять int на char чтобы он читал символы а не числа taken from ASCII table


            System.out.print((char) i+ " ");
        }
        System.out.println();

        System.out.println("--------------------------------");

        for (int i = 97; i <= 122 ; i++) {
            System.out.print((char) i + " ");
        }
        System.out.println();
        System.out.println("--------------------------------");
        for(char i = 'a'; i <= 'z'; i++){ //i: a, b, c, d, e, ... z
            System.out.print(i+" ");
        }

        System.out.println();

        System.out.println("------------------------------------------");

        //Z~A

        for(char i ='Z'; i >= 'A'; i--){
            System.out.print(i+" ");
        }

        System.out.println();

        System.out.println("------------------------------------------");


        for(char i ='z'; i >= 'a'; i--){
            System.out.print(i+" ");
        }

        System.out.println();

        System.out.println("------------------------------------------");

        for(char i = 1; i <= 40000; i++){
            System.out.print(i+" ");
        }

        //  char ch = 'Ψ';







    }
}
/*
        Print:
            A~Z
            a~z
            Z~A
            z~a
         */