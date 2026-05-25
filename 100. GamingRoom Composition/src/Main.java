// start from the GameRoom.java file to understand has a relation of composition.
// And observe how it is better than inheritance
// So we use Objects of other classes as variables in Base class. This is called composition.
public class Main {
    public static void main(String[] args) {

//        Values set to the classes.
        Desk desk = new Desk("40","60");
        Monitor monitor = new Monitor("Asus", "1080x1909", "144Hz");
        CPU cpu = new CPU("DELL", "Ryzen 9", "32 GB", "10 GB");
        Accessories accessories = new Accessories("Ant ESports Keyboard", "Lenovo Mouse","HyperX");

//        class's objects are provided to base class's object. (this is composition).
        GameRoom gameRoom = new GameRoom(desk, monitor, cpu, accessories);

//        Method call from Base class that is GameRoom
        gameRoom.getDesk();
        gameRoom.getMonitor();
        gameRoom.getCpu();
        gameRoom.getAccessories();

        System.out.println();
        System.out.println("You are good to go... Start your Gaming Experience... and do give the feedback if you liked the code...");
    }
}
