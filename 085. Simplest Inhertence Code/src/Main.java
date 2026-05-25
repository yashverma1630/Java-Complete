//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class Main {

    public static void main(String[] args) {

        Base b = new Base();

        b.setX(1);
        System.out.println(b.getX());

        Derived d = new Derived();

        d.setY(2);
        System.out.println(d.getY());

        d.setX(4);
        System.out.print(d.getX());


    }
}