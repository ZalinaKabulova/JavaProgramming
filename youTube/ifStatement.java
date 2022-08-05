import java.io.IOException;

public class ifStatement {
    public static void main(String[] args) throws IOException {

        char ch,answer = 'B';

        System.out.println("Какую букву я загадал?");
        System.out.print("попытайтесь ее угадать: ");

        ch = (char) System.in.read();  // выводит ответ 

        if (ch == answer){
            System.out.println("Поздравляю!");
        } else if (ch > answer){
            System.out.println("Перестарался!");
        }else {
            System.out.println("Недостарался");
        }
    }
}
