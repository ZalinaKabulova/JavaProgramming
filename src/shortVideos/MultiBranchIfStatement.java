package shortVideos;

public class MultiBranchIfStatement { // for more than three if statement
    public static void main(String[] args) {

        int score = 55;
        char grade; // A, B, C, D, F

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println(grade);
    }
}
