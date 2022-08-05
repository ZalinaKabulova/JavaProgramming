package tasksDay23;

public class eligibleToBuyAlcohol {

    public static void main(String[] args) {

        eligibleToBuyAlcohol(45);
        eligibleToVote(22);
    }

    public static void eligibleToBuyAlcohol(int age) {

        if (age >= 21) {
            System.out.println("Your age is eligible to buy alcohol");
        } else {
            System.out.println("You are not eligible to buy alcohol");
        }
    }

    public static void eligibleToVote(int age) {

        if (age >= 19) {
            System.out.println("You are eligible to vote in the United States of America");
        } else {
            System.out.println("You are not eligible to vote in the United States of America");
        }
    }


}
