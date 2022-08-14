package tasksDay40.animals;

public class Eagle extends WildAnimal{

    public Eagle(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }


    public void fly(){
        System.out.println(getName() + " is hunting");
    }
    @Override
    public void hunt() {
        System.out.println(getName()+ " is hunting");
    }
}
