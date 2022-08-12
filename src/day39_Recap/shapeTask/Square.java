package day39_Recap.shapeTask;

public class Square extends Shape{

    private double side;//we use private variable in order to make conditions throw setSide

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side <= 0){
            System.err.println("Invalid Side: "+side);
            System.exit(1);
        }

        this.side = side;
    }

    //                              -100
    public Square(double side) { // constructor
        super("Square");
        setSide(side);
    }


    public double area() {
        return side * side;
    }


    public double perimeter() {
        return side * 4;
    }


    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }


}

/*
Square extends Shape:
	variables:
		side;
	Encapsulate the field
	Add a constructor to set the filed
	area(): side * side
	perimeter(): side * 4
	toString(): side, area, perimeter
 */

