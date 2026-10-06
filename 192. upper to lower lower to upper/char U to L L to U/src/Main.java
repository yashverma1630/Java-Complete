public class Main {

    // it converts the given character to lower case by setting the 5th bit to 1
    public static Character toLower(char ch){
        return (char) (ch | 1<<5);
        // trick
        // you can simply do this like this (char) (ch | ' ').
    }

    // it converts the given character to upper case by setting the 5th bit to 0
    public static Character toUpper(char ch){
        return (char) (ch & ~(1<<5));
        // trick
        // you can simply do this like this (char) (ch & '_').
    }

    // it converts the given character to upper case if it is lower case and vice versa by toggling the 5th bit
    public static Character toUpperLower(char ch){
        return (char) (ch ^ 1<<5);
    }

    public static void main(String[] args) {
        char ch = 'a';
        System.out.println("Lower case of " + ch + " is: " + toLower(ch));
        System.out.println("Upper case of " + ch + " is: " + toUpper(ch));
        System.out.println("Toggle case of " + ch + " is: " + toUpperLower(ch));

        ch = 'A';
        System.out.println("Lower case of " + ch + " is: " + toLower(ch));
        System.out.println("Upper case of " + ch + " is: " + toUpper(ch));
        System.out.println("Toggle case of " + ch + " is: " + toUpperLower(ch));
    }
}
