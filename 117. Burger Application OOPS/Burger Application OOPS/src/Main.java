import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

//        Normal Headline of BurgerChamp Restaurant.
        System.out.println("Welcome to the BurgerChamps !!! ");
        System.out.println("Our Burger, Your Way !");

//        here total price will be added.
        int totalPrice=0;
        System.out.println("Here is our menu : ");

//        Empty string variables are created for VegMeal.java class.
        String vegBurger="";
        String vegDrink="";
        String vegSize="";
        String vegSideItem="";

//        Order Count is number of orders.
//        it is started from -1 because indexing in array starts with 0
        int orderCount = -1;
        boolean keepGoingMenu = true; // flag for keep going menu until (No) is typed.
        while(keepGoingMenu==true){
//            if more than 1 orders are made then it will ask this.
            if(orderCount>-1){
                System.out.print("Do you want to add more meals to the order ? (Yes/No) ");
                String moreMeal=scn.nextLine();

                if(moreMeal.toLowerCase().equals("yes")){

                }
                else if (moreMeal.toLowerCase().equals("no")){
                    System.out.println("No more meals are added here is your final bill : ");
                    keepGoingMenu=false;
                    break;
                }
            }
//            from here the selection of the meal starts.
            System.out.println("Select your Meal type : \n" +
                    "1. Quick Meal \n" +
                    "2. Customized Veg Meal \n" +
                    "3. Customized Non Veg Meal");

            System.out.print("Enter your Meal type number or type No to cancel the order : ");
            String mealNum = scn.nextLine(); // this is to select meal type : 1. Quick Meal, 2. Customized Veg Meal, 3. Customized Non Veg Meal

            if(mealNum.equals("1")){
                boolean keepGoingQuickMeal=true; // it is the flag for quick meal
                while(keepGoingQuickMeal==true) { // while it is true it will keep asking for quick meals.
                    System.out.println("We have 2 options in quick meal : \n" +
                            "1. Regular Meal Rs. 240 \n" +
                            "2. Delux Meal Rs. 350 / Delux Meal with extra fillings Rs. 360");

                    System.out.print("Enter your quick meal number or type no to cancel the order : ");
                    String quickMealNum = scn.nextLine(); // it is for getting quick meal number 1. Regular Meal and 2. Delux Meal

                    if (quickMealNum.equals("1")) {
                        orderCount++; // it will increase order number by 1.
                        Meal regmeal = new Meal();
                        Meal regularMealOrder = new Meal("1");
                        System.out.println(regularMealOrder);// regularMealOrder is used just to print the toString method in Meal.java
                        regmeal.regularMeal(); // calling method from Meal.java
                        totalPrice += regmeal.cost; // adding cost of regular meal to to total cost in the code.

                        System.out.print("Do you want to add more Quick Meals ?(Yes/No)  ");
                        String quickMealDecision = scn.nextLine(); // if yes then it will continue to ask you for the quick meal

                        if(quickMealDecision.toLowerCase().equals("yes")){ // if yes then it will continue the loop
                            continue;
                        }
                        else if(quickMealDecision.toLowerCase().equals("no")){ // else it will ask set the keepGoingQuickMeal flag to false and get out of the while loop
                            keepGoingQuickMeal=false;
                            break;
                        }
                    } else if (quickMealNum.equals("2")) { // delux meal is chosen.
                        System.out.print("Do you want some extra fillings in your delux burger ? (Yes/No) ");
                        String extraFillings = scn.nextLine(); // enter yes if you want extra fillings in it else enter no
                        Meal delmeal = new Meal();
                        if(extraFillings.toLowerCase().equals("no")){
                            orderCount++; // order count is increased
                            delmeal.DeluxMeal(); // normal delux meal is ordered
                            Meal deluxMealOrder = new Meal("2");
                            System.out.println(deluxMealOrder); // printing toString method of the code meal class.
                            totalPrice += delmeal.cost; // delmeal cost is added to total price.
                        }
                        else if(extraFillings.toLowerCase().equals("yes")){ //if extrafilling is asked.
                            orderCount++; // order count is increased
                            Meal deluxMealOrder = new Meal("3");
                            System.out.println(deluxMealOrder); // it is to print the toString method in Meal class
                            delmeal.DeluxMeal("Crunchy Chips");
                            totalPrice+= delmeal.cost; // it adds cost of the delux meal into the total cost variable
                        }

                        System.out.print("Do you want to add more Quick Meals ?(Yes/No)  ");
                        String quickMealDecision = scn.nextLine(); // it will ask you if you want more quick meals after ordering any one quick meal.

                        if(quickMealDecision.toLowerCase().equals("yes")){ // if yes then the loop will continue
                            continue;
                        }
                        else if(quickMealDecision.toLowerCase().equals("no")){ // else you will be the out of the loop and the flag will be set to false again.
                            keepGoingQuickMeal=false;
                            break;
                        }
                    } else {
                        System.out.println("Oops your order is canceled !"); // else your order is cancelled
                        keepGoingMenu = false;
                        break;
                    }
                }
            }
            else if(mealNum.equals("2")){
                boolean keepGoingVegMeal=true;
                while (keepGoingVegMeal==true){
                    VegMeal vegMeal = new VegMeal();
                    if(orderCount>-1){
                        System.out.print("Do you want to add more Veg Meal ? (Yes/No) ");
                        String continueVegMeal = scn.nextLine();
                        if(continueVegMeal.toLowerCase().equals("yes")){

                        }
                        else if(continueVegMeal.toLowerCase().equals("no")){
                            keepGoingVegMeal=false;
                            break;
                        }
                    }
                    else{
                        System.out.println("Create your customized Veg. Meal");
                    }
                    System.out.println("Burger List : \n" +
                            "1. Burger Champ's Special Burger Rs. 270 \n" +
                            "2. Veg Whopper Rs. 170 ");
                    System.out.print("Enter your burger number or Enter (no) to get out of the veg menu : ");
                    String burgerType = scn.nextLine();

                    if(burgerType.equals("1")){
                        orderCount++;
                        vegBurger="Burger Champ's Special Burger";
                        vegMeal.burgerChampsSpecialBurgerVeg(vegBurger);
                        totalPrice+=vegMeal.cost;

                    }
                    else if(burgerType.equals("2")){
                        orderCount++;
                        vegBurger = "Veg Whopper";
                        vegMeal.vegWhopper(vegBurger);
                        totalPrice+=vegMeal.cost;
                    }
                    else if(burgerType.toLowerCase().equals("no")){
                        orderCount++;
                        System.out.println("Veg meal cancelled");
                        vegBurger="";
                        keepGoingVegMeal=false;
                        break;
                    }

                    System.out.println("Drink List : \n" +
                            "1. Protein Shake Rs. 120 \n" +
                            "2. Kit-Kat Shake Rs. 90");
                    System.out.print("Enter your Drink number or Enter (no) to get out of the veg menu : ");
                    String drinkType = scn.nextLine();

                    if(drinkType.equals("1")){
                        orderCount++;
                        vegDrink = "Protein Shake";
                        vegMeal.proteinShake("Protein Shake");
                        totalPrice+=vegMeal.cost;
                    }
                    else if(drinkType.equals("2")){
                        orderCount++;
                        vegDrink = "Kit-Kat Shake";
                        vegMeal.proteinShake("Kit-Kat Shake");
                        totalPrice+=vegMeal.cost;
                    }
                    else if(drinkType.toLowerCase().equals("no")){
                        System.out.println("Drinks cancelled !");
                        vegDrink = "";
                        keepGoingVegMeal=false;
                        break;
                    }

                    System.out.println("Size of drink : ");
                    System.out.print("Pick your size number or Enter (no) to get out of the veg menu \n" +
                            "1. large Rs. 80\n" +
                            "2. medium Rs. 50\n" +
                            "3. small Rs. 20 : ");
                    String sizeType = scn.nextLine();

                    if(sizeType.equals("1")){
                        orderCount++;
                        vegSize = "large";
                        vegMeal.largeSize();
                        totalPrice+=vegMeal.cost;
                    }

                    else if(sizeType.equals("2")){
                        orderCount++;
                        vegSize = "medium";
                        vegMeal.mediumSize();
                        totalPrice+=vegMeal.cost;
                    }

                    else if (sizeType.equals("3")){
                        orderCount++;
                        vegSize = "small";
                        vegMeal.smallSize();
                        totalPrice+=vegMeal.cost;
                    }

                    System.out.println("Side Item List : \n" +
                            "1. French Fries Rs. 45\n" +
                            "2. Cup Cake Rs. 65");
                    System.out.print("Enter your Side Item number or Enter (no) to get out of the veg menu : ");
                    String sideItemType = scn.nextLine();

                    if(sideItemType.equals("1")){
                        orderCount++;
                        vegSideItem="French Fries";
                        vegMeal.frenchFries(vegSideItem);
                        totalPrice+=vegMeal.cost;
                    }

                    else if(sideItemType.equals("2")){
                        orderCount++;
                        vegSideItem = "Cup Cake";
                        vegMeal.cupCake(vegSideItem);
                        totalPrice+=vegMeal.cost;
                    }

                    else if(sideItemType.toLowerCase().equals("no")){
                        keepGoingVegMeal=false;
                        vegSideItem = "";
                        System.out.println("no side meal added");
                    }

                    VegMeal vegMealOrder = new VegMeal(vegBurger, vegDrink, vegSize, vegSideItem);
                    System.out.println(vegMealOrder);
                }
            }
            else if(mealNum.equals("3")){
                System.out.println("F*ck Yo* !");
                System.out.println("It's not good to kill animals just to feed yourself. ");

                System.out.print("Do you want to continue ? (Yes/No) ");
                String nonVegMeal = scn.nextLine();

                if(nonVegMeal.toLowerCase().equals("yes")){
                    continue;
                }
                else if (nonVegMeal.toLowerCase().equals("no")){
                    System.out.println("Your bull shit Non Veg. order is happily cancelled.");
                    keepGoingMenu=false;
                    break;
                }

            }
            else{
                System.out.println("You are out of the Menu !");
                keepGoingMenu=false;
                break;
            }
        }

        System.out.println();
        System.out.print("Total Bill : Rs. "+totalPrice);

    }
}
