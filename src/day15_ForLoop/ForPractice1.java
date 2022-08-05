package day15_ForLoop;

public class ForPractice1 {
    public static void main(String[] args) {
        for (char i = 'a'; i <= 'z'; i += 1  ){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-----------------------------");
        for(char i = 'A'; i <= 'Z'; i += 1){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-----------------------------");
        for(char i = 'Z'; i >= 'A'; i -= 1){
            System.out.print(i + " ");
        }

    }
}
