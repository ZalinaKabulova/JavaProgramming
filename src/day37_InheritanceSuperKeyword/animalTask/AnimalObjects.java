package day37_InheritanceSuperKeyword.animalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Alex","Husky",'M',3,"small","White");

        System.out.println(dog1);

        Cat cat1 = new Cat("Love", "Siamese",'F',2,"Large","Black");

        System.out.println(cat1);
        cat1.scratch();
        //  cat1.bark();
        //  cat1.sing();


        Parrot parrot1 = new Parrot("King","Macaw",'M', 3,"Small", "Blue");

        System.out.println(parrot1);

        parrot1.sing();
        //  parrot1.bark();
        //  parrot1.scratch();


    }

}
