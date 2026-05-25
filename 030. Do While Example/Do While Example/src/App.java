import java.util.*;
public class App {
    public static void main(String[] args){
        // boolean isReady = false;
        // int j = 1;
        // do{
        //     System.out.println(j);
        //     j++;
        //     isReady = j<=5;
        // }while(isReady);

        //Another way : 

        boolean isReady = false;
        int j = 1;
        do{
            if(j>5){
                break;
            }
            System.out.println(j);
            j++;
            isReady = j>0;
        }while(isReady);
    }
}
