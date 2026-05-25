// an abstract class that extends another abstract class has some flexibility.
// 1. it can implement all of the parent's abstract methods.
// 2. it can implement some of them.
// 3. or it can implement none of them.
// 4. it can also include additional abstract methods, which will force subclasses to implement both animal's abstract methods, as well as Mammal's


abstract class Mammal extends Animal {
    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.print(getExplicitType()+" ");
        System.out.println(speed.equals("slow") ? "walks": "runs");
    }

    public abstract void shedHair();
}

public abstract class Animal {
    protected String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public abstract void move(String speed); // abstract methods can't be used with method body.
                                            // also we can't use private access modifier in abstract method.

    public abstract void makeNoise();

    public final String getExplicitType() { // you can't override this method to other sub classes because it is strictly final.
        return getClass().getSimpleName() + " ("+type+")";
    }
}
