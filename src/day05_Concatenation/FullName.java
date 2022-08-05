package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {
       /* 1. Create a class called FullName.java
        2. Declare the following variables:
        1. firstName
        2. lastName
        3. Use concatenation to print the full address
        */
        String firstName = "Amelia";
        String lastName = "Oberwelland";
        int age = 48;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 6050.89;

        String fullName = firstName + " " + lastName;
        // Full name of the person is ______
        System.out.println("Full name of the person is " + fullName+ ".");
        // ____ is ____years old
        System.out.println(fullName + " is " + age +" years old.");
        // FullName is Jobtitle, works at CompanyName, and FullName's salary is Salary.
        System.out.println(fullName + " is " + jobTitle +", works" +  " at " + companyName +", and " +fullName+"'s salary "+ "is $"+ salary+".");



    }
}
