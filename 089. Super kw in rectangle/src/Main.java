public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4,6);

        System.out.print("Area of Rectangle: ");
        System.out.print(rectangle.getArea());

        System.out.println();

        System.out.print("Sum of x & y is ");
        System.out.print(rectangle.getSum());
    }
}

class Shape{
    private int x;
    private int y;

    public Shape(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getSum(){
        return x+y;
    }
}

class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int x, int y) {
        this(x, y, 20, 2);
    }

    public Rectangle(int x, int y, int width, int height){
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public int getArea(){
        return width*height;
    }
}