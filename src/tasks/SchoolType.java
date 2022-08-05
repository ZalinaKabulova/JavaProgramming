package tasks;

public class SchoolType {
    public static void main(String[] args) {
        /*Given a number(byte) grade level determine and print which school type someone is in.
                grade level and types are:
        1-5: Elementary school
        6-8: Middle school
        9-12: High school
        13-16: College
        17-18: Grad School*/
         int age = 14;

         boolean elementary = age >= 1 && age <= 5,
                 middle = age <= 8 && !elementary;
         boolean highSchool = age <= 12 && !elementary && !middle,
                 college = age <= 16 && !elementary && !middle && !highSchool,
                 gradSchool = age <= 18 && !college && !elementary && !middle && !highSchool;

         if(elementary){
             System.out.println("Elementary school.");
         }
         if(middle){
             System.out.println("Middle school.");
         }
         if(highSchool){
             System.out.println("High school.");
         }
         if(college){
             System.out.println("College.");
         }
         if(gradSchool){
             System.out.println("Graduation school.");
         }



    }
}
