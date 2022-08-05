package day37_Inheritance.animalTask;

public class Dog extends Animal{

    public int a;//we added extra instance for Dog class
    public Dog(String name,String breed, char gender, int age, String size, String color){
        super(name, breed, gender, age, size, color);
        //this.a = a;// the way we call the instance
    }

    public void bark(){

        System.out.println(name+" is barking");
    }


}
