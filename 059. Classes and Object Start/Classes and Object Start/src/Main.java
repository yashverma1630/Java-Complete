public class Main {
    public static void main(String[] args){
        Car car = new Car();
        // car.make= " Porsche";
        // car.Model= " X12";
        // car.color = "Red ";
        System.out.println("make = "+ car.getMake());
        car.setMake(" ");
        System.out.println("Model = "+ car.getModel());
        car.setModel("G-Class");
        car.describeCar();

    }
}
