public class EvenOdd {

    public boolean isEvenOdd(int number){
        return (number & 1) == 0;
    }
    public static void main(String[] args) {

        int n=7;

        EvenOdd eo = new EvenOdd();

        String result = eo.isEvenOdd(n)?"Even":"Odd";

        System.out.print("The number "+n+" is "+result);
    }
}
