// int is premetive
// Integer is wrapper class for int
public class Main {
    public static void main(String[] args) {

        int num = 8;

        Integer wrapperNum = new Integer(num); // boxing
        Integer autoWrapperNum = num; // auto-boxing
//        You can print the values if you want

        int premetiveNum = wrapperNum.byteValue(); // unboxing
        int autoPremetiveNum = wrapperNum; // auto-unboxing
//        You can print the values if you want


    }
}
