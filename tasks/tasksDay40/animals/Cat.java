package tasksDay40.animals;

public class Cat extends FriendlyAnimal{

    public Cat(String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super("Cat", breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    public void scratch(){
        System.out.println(getName() + " is scratching");
    }

    public void meow(){
        System.out.println(getName() + " is meowing");
    }
}
