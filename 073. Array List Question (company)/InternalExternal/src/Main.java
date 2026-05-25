import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        while(true){
            int n = scn.nextInt();
            if(n<0){
                break;
            }
            numbers.add(n);
        }

        int [] array = numbers.stream().mapToInt(i -> i).toArray();

        processArray(array);

        for(int num:array){
            System.out.println(num);
        }

    }

    public static void processArray(int [] array){
        for(int i = 0; i<array.length; i++){
            int number = array[i];
            boolean isInternal = number>49;
            boolean isExternal = number%10==5;

            if(isInternal && isExternal){
                array[i] = -8;
            }

            else if(isInternal){
                array[i]=-3;

            }

            else if (isExternal){
                array[i] = -9;
            }
        }
    }
}
