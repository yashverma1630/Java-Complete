class Mobile{
    String brand;
    static String name;
    int price;

    public void show(){
        System.out.println("brand : "+brand+", "+"name : "+name+", "+"price : "+price);
    }

}
public class Main {
    public static void main(String[] args){
        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        obj1.name = "Samsung galaxy S24";
        obj1.price = 20000;

        Mobile obj2 = new Mobile();
        obj2.brand = "Oneplus";
        obj2.name = "15R";
        obj2.price = 48000;

//        name is static variable and it is shared by all the objects of the class. when we change the value of name using obj2, it will change for obj1 as well because both obj1 and obj2 refer to the same static variable name.
//        as you can you see both the objects share the same name and they refer to same updated value of the name.
        obj1.show();
        obj2.show();
    }
}
