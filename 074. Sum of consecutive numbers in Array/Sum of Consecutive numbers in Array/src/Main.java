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

        int [] array = numbers.stream().mapToInt(i->i).toArray();

        processArray(array);

        for(int num:array){
            System.out.println(num);
        }


    }

    public static void processArray(int [] array){
        int sum =0;
        int nextIndex = 0;
        for (int i =0 ;i<array.length;i++){
            if(array[i]<100){
                sum+=array[i];

                if(i+1==array.length||array[i+1]>=100){
                    if(sum>0){
                        array[nextIndex++]=sum;
                    }
                    sum=0;
                }
                else{
                    array[nextIndex++]=array[i];
                }
            }
        }
    }
}
