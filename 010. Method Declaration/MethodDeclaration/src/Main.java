public class Main {
    public static void main(String[] args) {
        calculatescore(true, 800, 5, 100);
        System.out.println();
        calculatescore(true,10000,8,200);
    }

    public static void calculatescore(boolean gameover, int score, int levelcompleted, int bonus){
        int finalscore=score;

        if (gameover){
            finalscore+=(levelcompleted*bonus);
            System.out.print("final score is "+finalscore);
        }
    }
}
