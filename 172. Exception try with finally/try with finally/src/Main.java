public class Main {
    public static void main(String[] args) {
        int i = 18;
        int j = 2;
        try{
            System.out.printf("i divided by j is equals to %d\n",i/j);
        }catch(ArithmeticException e){
            System.out.println("divide by zero is not valid"+e.getMessage());
        }finally{
            System.out.println("This block will always execute regardless of exceptions.");
        }
    }
}
