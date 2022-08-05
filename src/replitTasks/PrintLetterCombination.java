package replitTasks;

public class PrintLetterCombination {
    public static void main(String[] args) {

        for(char i='z';i>='a';i--)  //начинает с z потом переходит на вторую лупу
            // и начиная с z и до a и снова возвращается в первую лупу начиная с буквы y опять прыгает на вторую лупу
        {
            for(char j='z';j>='a';j--)
            {
                System.out.print(i);
                System.out.print(j);
                System.out.println();
            }
        }
    }


}

