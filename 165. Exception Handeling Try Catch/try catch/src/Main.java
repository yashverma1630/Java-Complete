// Types of Exception
// Compile time Exception: These are the exceptions that occur during the compilation of the program. For example, syntax errors, type mismatch errors, etc.
// Runtime Exception: These are the exceptions that occur during the execution of the program. For example, division by zero, null pointer exception, array index out of bounds exception, etc.
// Checked Exception: These are the exceptions that are checked at compile time. For example, IOException, SQLException, etc.
// Unchecked Exception: These are the exceptions that are not checked at compile time. For example, NullPointerException, ArrayIndexOutOfBoundsException, etc.
// Exception Handling: Exception handling is the process of handling exceptions in a program.
// It is done using try-catch blocks. The try block contains the code that may throw an exception, and the catch block contains the code that handles the exception.
// The catch block is executed only if an exception occurs in the try block. If no exception occurs, the catch block is skipped.

// below you can check try block by changing the value of i from 0 to 2.
// below you can check catch block by setting the value of i to 0, which will cause a division by zero exception.

public class Main {
    public static void main(String[] args) {
        int j=18;
        int i=0;
        try{
            int result=j/i;
            System.out.println("result="+result);
        }catch(Exception e){
            System.out.println("Something went wrong");
        }

        System.out.println("Value of j = "+j);
        System.out.println("Value of i = "+i);
    }
}
