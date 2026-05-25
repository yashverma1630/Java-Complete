// Same code explanation as code number 98.
public class Main {
    public static void main(String[] args) {
        Refrigerator refrigerator = new Refrigerator("234", "Amul", "Milk");
        CoffeeMaker coffee = new CoffeeMaker("534", "Nescafe");
        DishWasher dishwash = new DishWasher("984","instant-wash");

        SmartKitchen smartKitchen = new SmartKitchen("23452", "Mom's smart kitchen", refrigerator, dishwash, coffee);

        smartKitchen.pourMilk();
        smartKitchen.addWater();
        smartKitchen.loadDishwasher();
    }
}
