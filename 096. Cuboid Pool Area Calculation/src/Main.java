import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double width = scn.nextDouble();
        double length = scn.nextDouble();

        Rectangle rectangle = new Rectangle(width, length);

        System.out.println(rectangle.getArea());
    }
}
