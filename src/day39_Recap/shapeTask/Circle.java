package day39_Recap.shapeTask;

public class Circle extends Shape{

    private double radius; //we use private variable in order to make conditions throw setRadius
    public static double pi = 3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius <= 0){
            System.err.println("Invalid Radius: "+radius);
            System.exit(1);
        }
        this.radius = radius;
    }

    public Circle( double radius) { //constructor
        super("Circle");
        setRadius(radius);
    }


    public double area() {
        return radius* radius* pi;
    }


    public double perimeter() {
        return 2*radius*pi;
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi='" + pi + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }

}
