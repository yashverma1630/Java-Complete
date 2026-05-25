/**
 * This class demonstrates a simple recursion example
 * that calculates the sum of numbers from 1 to k
 */
public class Main {

    /**
     * Recursive method to calculate the sum of numbers from 1 to k
     *
     * @param k the upper limit of the sum
     * @return the sum of numbers from 1 to k
     */
    public static int sum(int k){
        // Base case: if k is 0 or less, return 0 to stop the recursion
        if(k>0){
            // Recursive case: add k to the sum of (k-1)
            // This breaks down the problem into smaller subproblems
            return k + sum(k-1);
        }
        else{
            // Base case: return 0 when k reaches 0
            return 0;
        }
    }

    /**
     * Main method to test the recursive sum function
     */
    public static void main(String[] args){
        // Call the sum method with argument 10 to calculate 1+2+3+...+10
        int result = sum(10);
        // Print the result
        System.out.printf("the sum of numbers from 1 to 10 is %d", result);
    }
}
