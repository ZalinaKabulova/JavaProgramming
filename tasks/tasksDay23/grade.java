package tasksDay23;

public class grade {

    public static void main(String[] args) {

        grade(87);

    }


    public static void grade(int score) {

        String grade = "";
        if (score >= 0 && score <= 100) {
            grade = score >= 90 ? "A" : score >= 80 ? "B" : score >= 70 ? "C" : score >= 60 ? "D" : "E";

            System.out.println("Grade = "+grade);

        }

    }
}