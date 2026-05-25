public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic", "50", 12.5);
        Dog dog = new Dog();
        doAnimal(dog, "fast");
        doAnimal(animal, "slow");

        Dog yorkie = new Dog("Yorkie", 15);
        doAnimal(yorkie,"fast");
        Dog retriever = new Dog("Labrador Retriever",65.0,"floppy","Swimmer");
        doAnimal(retriever, "slow");

        Dog wolf = new Dog("wolf", 40);
        doAnimal(wolf,"slow");

        Fish goldie = new Fish("Goldfish", 60.0, 2, 3);
        doAnimal(goldie,"fast");
    }

    public static void doAnimal(Animal animal, String Speed){
        animal.move(Speed);
        animal.makeNoise();
        System.out.println(animal);
    }
}
