import java.util.*;
public class Main {
    public static void main(String[] args) {
        // This is Simple code for understanding
//        Rectangle rectangle = new Rectangle(2.0,2.0);
//        System.out.println(rectangle.getArea());
//        System.out.println(rectangle.getPerimeter());

        // Taking input n from user to take number of entries
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scn.nextInt();
        System.out.println();

        // array object of class rectangle
        Rectangle arr[] = new Rectangle[n];
        int index=0;

        for(int i = 1; i<=n; i++){
            // taking input of height and width from the user
            System.out.print("Enter Height"+i+": ");
            double height = scn.nextDouble();
            System.out.print("Enter Width"+i+": ");
            double width = scn.nextDouble();
            System.out.println();

            // assigning values into the object ...  or we can say assigning values to the fields
            Rectangle rectangle = new Rectangle(height, width);
            // putting object into the array...
            arr[index]=rectangle;
            index++;

            // display area of rectangle and perimeter of rectangle
            System.out.println("Area of Rectangle"+i+": "+rectangle.getArea());
            System.out.println("Perimeter of Rectangle"+i+": "+rectangle.getPerimeter());
            System.out.println();


        }

        // This will Display data stored in array ...
        System.out.println("**************");
        System.out.println(" Stored Data: ");
        System.out.println("**************");
        System.out.println();

        for(int j = 0 ;j<n;j++){
            System.out.println("Area of Rectangle"+(j+1)+": "+arr[j].getArea());
            System.out.println("Perimeter of Rectangle"+(j+1)+": "+arr[j].getPerimeter());
            System.out.println();
        }
    }
}
// Thank You and Enjoy Coding with Yash ... HeHe...