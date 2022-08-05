package day35_Encapsulation.encapsulation;

public class PersonObjects {

    public static void main(String[] args) {

        Person p1 = new Person();

        //p1.name = "Daniel";
        //p1.age = 28;
        // we can not use this data types because we have the encapsulated
    //we can not have direct an access

        p1.setName("Daniel");
        p1.setAge(28);

        //    System.out.println(p1.name +" : "+p1.age);

        System.out.println(p1.getName()+ ": "+p1.getAge());
//in order to read it we must use getter



    }
}
