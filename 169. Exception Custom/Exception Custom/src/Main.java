// custom exception class.

class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}
public class Main {
    public static void main(String[] args) {
        int j=18;
        int i=20;
        try{
            int result=j/i; // the result will be zero and we are throwing exception on it.
            if(result==0){
                throw new MyException("Result is zero. This is not allowed."); // Manually throwing an exception if result is zero.
            }
            System.out.println("result="+result);
        }catch(MyException e){
            System.out.println(e+ " -> Default value of j is "+j/1);
        }catch(Exception e){
            System.out.println(e+"-> Something else went wrong");
        }

        System.out.println("Value of j = "+j);
        System.out.println("Value of i = "+i);
    }
}
