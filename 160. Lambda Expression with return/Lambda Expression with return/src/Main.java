@FunctionalInterface
interface A{
    int add(int i, int j);
}
public class Main {
    public static void main(String[] args) {
//        A obj = new A(){
//            @Override
//            public int add(int i, int j) {
//                return i+j;
//            }
//        };

//        this is lambda expression for return type method.
        A obj = (int i, int j) -> i+j;

        int total = obj.add(20, 30);
        System.out.println(total);
    }
}
