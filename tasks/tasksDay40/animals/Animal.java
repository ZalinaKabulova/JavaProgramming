package tasksDay40.animals;

public class Animal {

    private String name;
    private String breed;
    private char gender;
    private int age;
    private String size;
    private String color;

    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setSize(size);
        setColor(color);
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;

        if(name == null & name.isBlank()){
            System.err.println("Error");
            System.exit(0);
        }
    }

    public void setBreed(String breed) {
        this.breed = breed;
        if(breed == null & breed.isBlank()){
            System.err.println("Error");
            System.exit(0);
        }
    }

    public void setGender(char gender) {
        this.gender = gender;
        if(!(gender == 'M' || gender == 'F')){
            System.err.println("Error");
            System.exit(0);
        }

    }

    public void setAge(int age) {
        this.age = age;
        if(age <= 0){
            System.err.println("Error");
            System.exit(0);
        }

    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;

        if(color == null & color.isBlank()){
            System.out.println("Error");
            System.exit(0);
        }
    }

    public void eat(){
        System.out.println(name+ " is eating");
    }

    public void drink(){
        System.out.println(name+ " is drinking");
    }

    public void sleep(){
        System.out.println(name+ " is sleeping");
    }

    public void move(){
        System.out.println(name+ " is moving");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
1. Create a class named Animal:
			variables:
				name, breed, gender, age, size, color

			Encapsulate all the fields

			Add a constructor to set all the fields

					Conditions:
						1. name, breed and color can not be null (if obj == null means it's error)
						2. name, breed and color can not be empty or can not be blank
						3. gender should only be set to either 'M' or 'F'
						4. age can not be set to negative

			Methods:
				eat()
				drink()
				sleep()
				move()
				toString()

 */