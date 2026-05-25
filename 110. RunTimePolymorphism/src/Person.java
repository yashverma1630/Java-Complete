public class Person {
    public void showDetail(){
        System.out.println("Basic details of Person");
    }
}

class Emp extends Person{
    public void showDetail() {
        System.out.println("Showing the detail of the Employee.");
    }
}

class Ram extends Person{
    public void doWork(Person person){
        person.showDetail();
    }
}
