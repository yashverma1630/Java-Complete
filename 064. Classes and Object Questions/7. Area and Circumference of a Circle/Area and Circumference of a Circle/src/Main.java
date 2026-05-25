import java.util.*;

class Circle{
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return 3.14159265359*radius*radius;
    }

    public double getCircumference(){
        return 2*3.14159265359*radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0);

        System.out.println("Area of Circle: "+circle.getArea());
        System.out.println();
        System.out.print("Circumference of Circle: "+circle.getCircumference());
    }
}
