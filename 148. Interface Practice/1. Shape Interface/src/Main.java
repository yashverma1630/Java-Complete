import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        var rectangle = new Rectangle(5, 3);
        var triangle = new Triangle(5, 3);
        var circle   = new Circle(5);

        System.out.println("Area of rectangle is "+rectangle.getArea());
        System.out.println("Area of Triangle is "+triangle.getArea());
        System.out.println("Area of Circle is "+circle.getArea());

        ArrayList<Double> shapeAreas = new ArrayList<Double>(3);
        shapeAreas.add(rectangle.getArea());
        shapeAreas.add(triangle.getArea());
        shapeAreas.add(circle.getArea());

        System.out.println("List of shapes areas is "+ shapeAreas);

        shapeAreas.sort(Comparator.naturalOrder());

        System.out.println("Sorted List of shapes areas is "+shapeAreas);

    }
}
