public abstract class Animal {
    private String species;
    private int lifespan;
    public Animal(String species, int lifespan) {
        this.species = species;
        this.lifespan = lifespan;
    }

    abstract void sound();

    public void getSpecies(){
        System.out.println(getClass().getName()+"'s species is "+species);
    }

    public void getLifespan(){
        System.out.println(getClass().getName()+"'s lifespan is "+lifespan);
    }
}

class Lion extends Animal{
    public Lion(String species) {
        super(species, 15);
    }

    @Override
    void sound() {
        System.out.println("Lion : Grrrr Roaaar !!!");
    }
    public void lionHunting(){
        System.out.println(getClass().getName()+"'s Hunting behaviour: it gets so violent and attacks the prey");
    }
}

class Tiger extends Animal{
    private Integer stripCount;

    public Tiger(String species) {
        super(species, 12);
    }

    @Override
    void sound() {
        System.out.println("Tiger : Grrrr Roaaar !!!");
    }

    public void tigerStripCount(int stripCount){
        this.stripCount=stripCount;
    }

    public void displayStripCount(){
        System.out.println(getClass().getName()+" has "+stripCount+" strips");
    }
}