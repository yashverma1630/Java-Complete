//This code is about Inheritence VS Composition
// To understand this code better follow below path.
// Product.java -> PersonalComputer.java -> Main.java.
// Happy Coding. Remember consistency is key to success. keep it up champ... !

public class Main {
    public static void main(String[] args) {

        // assigned values to computer parts.
        ComputerCase theCase = new ComputerCase ("2208", "Dell", "240");
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, "2540 x 1440");
        Motherboard theMotherboard = new Motherboard("BJ-200","Asus", 4, 6, "v2.44");

        // personal computer assembled.
        PersonalComputer thePC = new PersonalComputer ("2208", "Dell", theCase, theMonitor, theMotherboard);

        // got the output from parts of the personal computer.
        //in below code we are calling getMonitor method from PersonalComputer Class and we are getting the output
        // of method (or we can say function) from the class.
        thePC.getMonitor().drawPixelAt(10, 10, "red");
        thePC.getMotherboard().loadProgram("Windows OS ");
        thePC.getComputerCase().pressPowerButton();
    }
}
