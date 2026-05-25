public class Main {
    public static void main(String[] args) {
        boolean gameover=true;
        int score = 800;
        int levelcompleted = 5;
        int bonus = 100;

        calculatescore(gameover, score, levelcompleted, bonus);

        score = 10000;
        levelcompleted = 8;
        bonus = 200;

        calculatescore(gameover, score, levelcompleted, bonus);

    }

    public static void calculatescore(boolean gameover, int score, int levelcompleted, int bonus){
        int finalscore = score;
        if(gameover){
            finalscore+=(levelcompleted * bonus);
            finalscore+=1000;
            System.out.println("Your final score was " + finalscore);
        }
    }
}
