package day39_Recap.cydeoTask;

public class Cydeo {

    public static void main(String[] args) {

        Developer developer = new Developer("Omar",35,'M',123456,"Java Developer",300000.0);

        Tester tester = new Tester("Olga",29,'F',12345,"SDET",110000);

        Teacher teacher = new Teacher ("Daniel",32,'M',12345,"Math teacher",100000);

        Student student = new Student("Arman",23,'M',123345,"Two Foreign Languages");

        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);


        System.out.println("----------------------------");

        developer.setAge(39);

        System.out.println(developer.getAge());

        System.out.println(developer);

        System.out.println("-----------------------------------------------------------------");

        developer.work();
        tester.work();
        teacher.work();
        //  student.work();

        System.out.println("------------------------------------------------------------");

        developer.eat();
        developer.drink();
        developer.sleep();

        developer.fixingBugs();

        System.out.println("------------------------------------------------------------");

        tester.eat();
        tester.drink();
        tester.sleep();

        // tester.fixingBugs();
        tester.createTicket();

        System.out.println("------------------------------------------------------------");

        teacher.eat();
        teacher.drink();
        teacher.sleep();

        // teacher.fixingBugs();
        //  teacher.createTicket();

        System.out.println("------------------------------------------------------------");

        student.eat();
        student.drink();
        student.sleep();

        // student.fixingBugs();
        // student.createTicket();
        student.study();






    }


}

