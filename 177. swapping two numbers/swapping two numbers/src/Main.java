public class Main {
    public static void main(String[] args){
        int a = 5;
        int b = 4;

//        without using any temp variable
//        a=a+b;
//        b=a-b;
//        a=a-b;
//
//        System.out.println(a+" "+b);

//        using xor
//        a=a^b;
//        b=a^b;
//        a=a^b;
//
//        System.out.println(a+" "+b);

//        fast way to swap two numbers in one line without creating any temp variable
        b=a+b-(a=b);

        System.out.println(a+" "+b);
    }
}
