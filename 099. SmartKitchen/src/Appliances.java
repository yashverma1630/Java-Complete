public class Appliances {
    private String Model;
    private String Brand;

    public Appliances(String model, String brand) {
        Model = model;
        Brand = brand;
    }
}

class Refrigerator extends Appliances {
    private String food;

    public Refrigerator(String model, String brand, String food) {
        super(model, brand);
        this.food = food;
    }

    boolean hasWorkToDoR = false;

    public void orderFood(){
        if(hasWorkToDoR) {
            System.out.println("Food ordered is " + food);
        }
    }
}

class DishWasher extends Appliances {
    public DishWasher(String model, String brand) {
        super(model, brand);
    }

    boolean hasWorkToDoD = false;

    public void doDishes(){
        if(hasWorkToDoD) {
            System.out.println("washing Dishes... !");
        }
    }
}

class CoffeeMaker extends Appliances{
    public CoffeeMaker(String model, String brand) {
        super(model, brand);
    }

    boolean hasWorkToDoC = false;

    public void brewCoffee() {
        if(hasWorkToDoC) {
            System.out.println("Your Hot and Tasty coffee is getting ready... !");
        }
    }
}
