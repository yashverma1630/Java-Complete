class Animal {
    public void eat() {
        System.out.println("Some Animals are veg and some are non veg");
    }
}

public class Main {
    public static void main(String[] args) {
        new Animal(); // so this is called Anonymous object (for now it is created but not in use). the object which has no reference.
//        you can still access methods in Animal class using this anonymous object by using . dot followed mehtod name in that class.
        new Animal().eat(); // now it is in use.
    }
}
