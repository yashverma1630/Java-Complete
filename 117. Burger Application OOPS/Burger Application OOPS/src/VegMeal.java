public class VegMeal extends Meal{
    private String Burger;
    private String Drink;
    private String Size;
    private String SideItem;
    public int cost;

    public VegMeal(){

    }
    public VegMeal(String burger, String drink, String size, String sideItem) {
        Burger = burger;
        Drink = drink;
        Size = size;
        SideItem = sideItem;
    }

    public void burgerChampsSpecialBurgerVeg(String Burger){
        this.Burger=Burger;
        System.out.println("Order Added : Burger champ's Special Burger");
        cost+=270;
    }

    public void vegWhopper(String Burger){
        this.Burger = Burger;
        System.out.println("Order Added : Veg. Whopper");
        cost+=170;
    }

    public void proteinShake(String Drink){
        this.Drink = Drink;
        System.out.println("Order Added : Protein shake");
        cost+=120;
    }

    public void kitkatShake(String Drink){
        this.Drink=Drink;
        System.out.println("Order Added : Kit-Kat Shake");
        cost+=90;
    }

    public void smallSize(){
        this.Size = "Small";
        System.out.println("Small Size");
        cost+=20;
    }

    public void mediumSize(){
        this.Size="Medium";
        System.out.println("Medium Size");
        cost+=50;
    }

    public void largeSize(){
        this.Size = "Large";
        System.out.println("Large Size");
        cost+=80;
    }

    public void frenchFries(String SideItem){
        this.SideItem=SideItem;
        System.out.println("Item Ordered : French Fries");
        cost+=45;
    }

    public void cupCake(String SideItem){
        this.SideItem=SideItem;
        System.out.println("Item Ordered : Cup Cake");
        cost+=65;
    }

    @Override
    public String toString() {
        return "VegMeal{" +
                "Burger='" + Burger + '\'' +
                ", Drink='" + Drink + '\'' +
                ", Size='" + Size + '\'' +
                ", SideItem='" + SideItem + '\'' +
                '}';
    }
}
