public class Main{
    public static void main(String[] args) {
//        this code is about method overloading
//        Simplest and easy to understand.
        Dog dog = new Dog();

        System.out.println("Printing the method bark()");
        dog.bark(5);

        System.out.println();

        System.out.println("Printing the method bark(int number)");
        dog.bark();
    }
}

class Dog{

    public void bark(){
        System.out.print("woof");
    }

    public void bark(int number){
        for(int i = 0 ; i<number; i++){
            System.out.println("woof");
        }
    }
}