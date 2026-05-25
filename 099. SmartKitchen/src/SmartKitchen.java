public class SmartKitchen extends Appliances {

    private Refrigerator refrigerator;
    private DishWasher dishwasher;
    private CoffeeMaker coffeemaker;

    public SmartKitchen(String model, String brand, Refrigerator refrigerator, DishWasher dishwasher, CoffeeMaker coffeemaker) {
        super(model, brand);
        this.refrigerator = refrigerator;
        this.dishwasher = dishwasher;
        this.coffeemaker = coffeemaker;
    }

    public CoffeeMaker addWater(){
        coffeemaker.hasWorkToDoC=true;
        coffeemaker.brewCoffee();
        return coffeemaker;
    }

    public Refrigerator pourMilk(){
        refrigerator.hasWorkToDoR=true;
        refrigerator.orderFood();
        return refrigerator;
    }

    public DishWasher loadDishwasher(){
        dishwasher.hasWorkToDoD=true;
        dishwasher.doDishes();
        return dishwasher;
    }

}
