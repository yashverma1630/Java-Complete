// Main class that demonstrates the Fibonacci sequence using recursion
public class Main {

    // Recursive method to calculate the nth Fibonacci number
    // The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
    // Each number is the sum of the two preceding numbers
    public static int fibonacci(int n){
        // Base case: if n is 0 or 1, return n itself
        if(n<=1){
            return n;
        }
        // Recursive case: return sum of previous two Fibonacci numbers
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    // Main method - entry point of the program
    public static void main(String[] args){
        // Print the 5th Fibonacci number
        System.out.println(fibonacci(5));
    }
}
