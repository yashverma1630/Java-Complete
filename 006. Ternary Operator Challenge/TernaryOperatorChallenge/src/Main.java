public class Main {
    public static void main(String[] args) {
        double a = 20.00d; // some value added in variable a
        double b = 80.00d; // some value added in variable b
        double result = (a+b)*100.00d; // result is adding a and b multiplied by 100
        System.out.println("The result is equals to "+result); // result is printed
        double remainder = result%40.00d; // remainder is calculated by using modulas % operator
        System.out.println("The remainder is equals to "+remainder); // remainder is printed
        boolean isremainder = (remainder==0)? true:false; // if remainder is equals to 0 then it will is isremainder to true. else it will set it to false.
        System.out.println("remainder is equal to zero, true or false ? "+isremainder); // it will print if the remainder is true or false.
        String s = (isremainder)?"remainder is 0":"got some remainder"; // if remainder is true then it will set the 1st string before : . else it will set the second string after :.
        System.out.print(s); // simply it will print the String s.
    }
}
