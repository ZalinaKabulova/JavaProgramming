package week_16_21_8_22;

import week_16_21_8_22.Exercise;

public class Swimming extends Exercise {

    public Swimming(double weight) {
        super(weight);
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return (int)(minutes*8*(weight/100));
    }

    @Override
    public void perform() {
        System.out.println("Performing swimming exercise in the pool");
    }
}
