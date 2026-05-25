public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Yash Verma", 20);
        Person person2 = new Person("Yashasvi Yadav",20);

        System.out.println("Details of Person 1: ");
        System.out.println("Name of Person1: "+person1.getName());
        System.out.println("Age of Person1: "+person1.getAge());

        System.out.println();

        System.out.println("Details of Person 2: ");
        System.out.println("Name of Person2: "+ person2.getName());
        System.out.println("Age of Person2: "+ person2.getAge());
    }
}
