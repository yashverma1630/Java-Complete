// This is problem code for Encapsulation to understand why encapsulation is important.
// Allowing direct access to data on an object can bypass checks and operations.
// The commented out code below is problem code. player.java class is problem code. and not a good approach. That's why encapsulation is important.
// EnhancedPlayer class will explain you more about encapsulation. private field names used instead of public.
// constructor is created to set the field's validation.
// This restricted access to data is encapsulation.
// if the code is changed in any class. The main will still be working. to check this just try to rename(refactor/or we can say change all the variable names that have same name) the variable fields.
public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//
//        player.name ="Tim";
//        player.health=20;
//        player.weapon ="Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = "+ player.healthRemaining());
//        player.health = 200;
//        player.loseHealth(11);
//        System.out.println("Remaining health = "+player.healthRemaining());

        EnhancedPlayer yash = new EnhancedPlayer("yash");
        System.out.println("Initial Health of Yash is "+ yash.healthRemaining());
        EnhancedPlayer tim = new EnhancedPlayer("Tim", 200, "Sword");
        System.out.println("Initial health is "+ tim.healthRemaining());
    }
}
