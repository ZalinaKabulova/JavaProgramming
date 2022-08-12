public class Question {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            for (int j = 3; j >= 0; j--) {
                if (i == j)
                    continue;
                System.out.println(i + " " + j);
            }
        }

        int x = 42;
        int answer = x/7 +1 *3;
        if(x % 7 == 0)
            answer ++;

        System.out.println(answer); //10

    }
}
