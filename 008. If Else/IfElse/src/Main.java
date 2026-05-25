// 1st if block is executed if true. and if it is false then else if checked.
// if else if block is true then it will be executed and if else if block condition is false then else block will be executed.

public class Main {
    public static void main(String[] args) {
        int score = 1800; // change the value of score according to if else statements to see different results.
        if (score>1800 && score<1800){
            System.out.print("code executed we are in if block");
        }

        else if (score>=1800){
            System.out.print("code is executed we are in else if block");
        }

        else {
            System.out.print("we are in else block");
        }
    }
}
