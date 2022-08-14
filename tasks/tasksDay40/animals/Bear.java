package tasksDay40.animals;

public class Bear extends WildAnimal {

    public Bear(String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super("Bear", breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    @Override
    public void hunt() {
        System.out.println(getName()+ " is hunting");
    }
}
