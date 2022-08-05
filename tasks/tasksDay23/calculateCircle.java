package tasksDay23;

public class calculateCircle {

    public static void main(String[] args) {

        areaOfCircle(4.6);

    }
//6. create a method that can calculate the area of a circle
    public static void areaOfCircle (double radius){

        double area = radius * radius * 3.14;
        System.out.println("Area is "+area);

    }
}
