public class Main {
    public static void main(String[] args) {
        for(Vibgyor vibgyor : Vibgyor.values()){
            System.out.println(vibgyor);
        }
    }

    public enum Vibgyor{
        VIOLET, INDIGO, BLUE, GREEN, YELLOW, ORANGE, RED
    }
}
