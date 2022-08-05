package shortVideos;

public class NestedIfStatement {
    public static void main(String[] args) {
        int score = 55;

        if (score >=0 && score <= 100){ //pre- condition: if the score is valid
            if (score >= 60){ //score is < 60
                System.out.println("Passed");
            }else {
                System.out.println("Failed");
            }
        } else {
            System.out.println("Invalid Score");//if the score is not valid
        }



}}
