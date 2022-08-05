package day37_Inheritance.scrumTask;

public class Employee extends Person {

    public String jobTitle, companyName;
    public int id;
    public double salary;


    public Employee(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
        this.companyName = companyName;
    }

    public void work(){
        System.out.println(jobTitle+" "+name + " is working");
    }

    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", id=" + id +
                ", salary= $" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
name, gender, age, jobTitle, id, salary, companyName
 work(), toString()
 */