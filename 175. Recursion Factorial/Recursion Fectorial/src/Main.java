// Main class to demonstrate recursive factorial calculation
public class Main {

    /**
     * Recursively calculates the factorial of a given number n.
     * Factorial formula: n! = n * (n-1) * (n-2) * ... * 1
     *
     * @param n the non-negative integer whose factorial is to be computed
     * @return the factorial of n
     */
    public static int fectorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Recursive case: n! = n * (n-1)!
            return n * fectorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int k = 5; // The number whose factorial we want to find

        // Calculate and print the factorial of k
        System.out.println("Factorial of " + k + " is: " + fectorial(k));
    }
}
