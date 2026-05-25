public class Main {
    public static void main(String[] args) {
        boolean gameover = true;
        int score = 10000;
        int levelcompleted = 8;
        int bonus = 200;
        int finalscore=score;

        if (gameover){
            finalscore+=(levelcompleted*bonus);
            System.out.print("final score is "+finalscore);
        }
    }
}
