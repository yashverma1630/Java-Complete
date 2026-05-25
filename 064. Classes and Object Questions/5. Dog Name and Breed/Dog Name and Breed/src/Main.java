public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();

        dog1.setDogname("scooby");
        dog1.setBreed("American Eskimo Dog");

        System.out.println("Dog Name: "+dog1.getDogname());
        System.out.println("Dog Breed: "+dog1.getBreed());

        Dog dog2 = new Dog();

        dog2.setDogname("Doris");
        dog2.setBreed("Golden Retriever");

        System.out.println();

        System.out.println("Dog Name: "+dog2.getDogname());
        System.out.println("Dog Breed: "+dog2.getBreed());

    }
}
