package day03_EscapeSequences;

/*
Escape sequences: MUST be given with double quote
    \n: starts a new line
    \t: paragraph space (tab)
    \\: single back slash
    \": double code
 */
public class EscapeSequences {

    public static void main(String[] args) {
        System.out.println("Java \nPython \nC#");

        System.out.println("---------------------------------------------");
        System.out.println("Hello Cydeo How are you all today? \nIt is nice to see you all! \nWhat class do we have next week?");
        System.out.println("--------------------------------------");
        System.out.println("\tJava is cool Programming Language");

        System.out.println("____________________________");
        System.out.println("/ \\ / \\ / \\"); // in order to print one back slash we need to give two back slash
        System.out.println("_____________________________");
        System.out.println("My favourite TV show is \"Game of Throne\"."); // in order to print double quote we need to use \"



    }
}
