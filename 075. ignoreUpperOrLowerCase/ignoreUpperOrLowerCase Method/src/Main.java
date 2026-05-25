public class Main {
    public static void main(String[] args) {
        Calc(5,5,"MUL");
        Calc(2,5,"sum");

    }

    public static void Calc(int a, int b, String condition){
        if(condition.equalsIgnoreCase("MuL")){
            System.out.println("Multiply: "+(a*b));
        }
        else if(condition.toUpperCase().equals("SUM")){
            System.out.println("Sum: "+(a+b));
        }
    }
}
