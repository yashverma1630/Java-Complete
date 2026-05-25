// This is the Base class. or you can say the top most class.

// Base class Meal
// We have 2 options in normal meals. Regular and Delux.
public class Meal {
    private String RegularMeal;
    private String DeluxMeal;

    public Meal(String mealNumber){
        if(mealNumber.equals("1")){
            RegularMeal="Regular Meal : \n" +
                    "1. Classic Burger \n" +
                    "2. Cold Coffee \n" +
                    "3. French Fries";
        }

        else if (mealNumber.equals("2")){
            DeluxMeal="Delux Meal : \n" +
                    "1. Cheesy Crunchy Burger \n" +
                    "2. Protein Milk Shake (28g protein) \n" +
                    "3. French Fries";
        }

        else if(mealNumber.equals("3")){
            DeluxMeal = "Delux Meal : \n" +
                    "1. Cheesy Crunchy Burger \n" +
                    "2. Protein Milk Shake (28g protein) \n" +
                    "3. French Fries \n" +
                    "4. Crunchy Chips";
        }
    }


    public Meal(){

    }

    int cost;

    public void regularMeal(){
        System.out.println("Here is your Regular Meal ! you got : \n" +
                "1. Classic Burger \n" +
                "2. Cold Coffee \n" +
                "3. French Fries");

        cost+= 240;
    }

    public void DeluxMeal(){
        System.out.println("Here is your Delux Burger Meal ! you got : \n" +
                "1. Cheesy Crunchy Burger \n" +
                "2. Protein Milk Shake (28g protein) \n" +
                "3. Mix veg. whole wheat roll");
        cost += 350;
    }

    public void DeluxMeal(String extraFillings){
        System.out.println("Here is your Delux Burger Meal ! you got : \n" +
                "1. Cheesy Crunchy Burger \n" +
                "2. Protein Milk Shake (28g protein) \n" +
                "3. Mix veg. whole wheat roll \n" +
                "4. With Extra Filling of "+extraFillings);
        cost += 360;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "RegularMeal='" + RegularMeal + '\'' +
                ", DeluxMeal='" + DeluxMeal + '\'' +
                '}';
    }
}
