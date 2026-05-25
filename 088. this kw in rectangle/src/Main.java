public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle (2, 2, 20,3);
        Rectangle rectangle = new Rectangle (5, 5);

        System.out.print("Area of Rectangle: ");
        System.out.print(rectangle.getArea());

        System.out.println();

        System.out.print("Sum of x & y is ");
        System.out.print(rectangle.getSumXY());

        System.out.println();
        System.out.println("------------------");

        System.out.print("Area of Rect: ");
        System.out.print(rect.getArea());

        System.out.println();

        System.out.print("Sum of x & y is ");
        System.out.print(rect.getSumXY());
    }
}

class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(){
        this(5, 5);
    }

    public Rectangle(int width, int height){
        this(0, 0, width, height);
    }

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getArea(){
        return width*height;
    }

    public int getSumXY(){
        return x+y;
    }
}
