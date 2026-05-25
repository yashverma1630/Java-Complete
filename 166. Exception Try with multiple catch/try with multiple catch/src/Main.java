// Try with multiple catch

public class Main {
    public static void main(String[] args) {
        int j=18;
        int i=2;
        try{
            int result=j/i; //This will throw ArithmeicException because it cannot be devided by zero.

            int arr[] = new int[5]; // length of array is 5.
            arr[10] = 50; // This will throw ArrayIndexOutOfBoundsException
            System.out.println("result="+result);
        }catch(ArithmeticException e){
            System.out.println(e+"-> Cannot divide by zero. Please provide a non-zero value for i.");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e+"-> You have selected invalid index for the array arr");
        }catch(Exception e){
            System.out.println(e+"-> Something else went w");
        }

        System.out.println("Value of j = "+j);
        System.out.println("Value of i = "+i);
    }
}
