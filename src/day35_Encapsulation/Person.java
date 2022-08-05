package day35_Encapsulation;

import org.w3c.dom.ls.LSOutput;

public class Person {

    public String name, language;
    public int age;
    public char gender;
    public static String planet;
    public static int numberOfHead, numberOfWings;
    public static boolean isHuman,hasNose;

    public Person(String name, String language, int age, char gender) {
        this.name = name;
        this.language = language;
        this.age = age;
        this.gender = gender;
    }

    static {
        planet= "Earth";
        isHuman = true;
        hasNose = true;
        numberOfHead = 1;
        numberOfWings = 0;

    }



    public void printPlanetName(){//public static void(){System.out.println("The name of the planet"+name);}
        System.out.println(name+" from the planet named "+planet);//пояснение при статик методе мы не можем
    }//использвать поля тоесть филды -инстансы поэтому следующий метом мы сделали не статик

    public void eat(String food){
        System.out.println(name +" is eating "+food);
    }

    public void drink (String drink){
        System.out.println(name+ " is drinking "+drink);
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", planet =" + planet +
                '}';
    }
}
/*
1. Create a class named Person:
			Variables:
				name, age, gender, language, planet, isHuman, hasNose, numberOfWings,
				numberOfHead

			Add a constructor to initialize all the fields

			Add a static block to initialize all the statics

			Methods:
				printPlanetName()
				eat(String food)
				drink(String drink)
				toString()
 */