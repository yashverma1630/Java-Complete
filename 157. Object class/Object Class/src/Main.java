class Laptop{
    String model;
    int price;
//    Object class is the parent class of all the classes in java. it has some default methods like toString, equals, hashcode etc.
//    These below methods are from object class. and they will print default values. if not declared separately.
    public String toString(){
        return "model = "+model+", price = "+price;
    }

    public boolean equals(Laptop that){
        return this.model.equals(that.model) && this.price == that.price;
    }

}

public class Main {
    public static void main(String[] args) {
        Laptop device1 = new Laptop();
        Laptop device2 = new Laptop();

        device1.model = "Dell XPS 13";
        device1.price = 999;

        device2.model = "Dell XPS 13";
        device2.price = 999;

        System.out.println(device1);
        System.out.println(device2);

        System.out.println(device1.equals(device2));

    }
}
