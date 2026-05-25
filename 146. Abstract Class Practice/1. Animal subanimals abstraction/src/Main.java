public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion("Mufasa");
        lion.sound();
        lion.lionHunting();
        lion.getSpecies();
        lion.getLifespan();

        System.out.println("-".repeat(60));

        Tiger tiger = new Tiger("Babbar Sher");
        tiger.sound();
        tiger.tigerStripCount(50);
        tiger.displayStripCount();
        tiger.getSpecies();
        tiger.getLifespan();
    }
}
