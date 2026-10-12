import java.util.ArrayList;

import static javax.sound.midi.MidiSystem.getSequence;

public class Main {
    public static void getSequece(int i, ArrayList<Integer> list, int arr[]){
        if(i>=arr.length){
            if(list.size()==0){
                return;
            }
            else{
                System.out.println(list.toString());
            }
//            System.out.println(list.toString());
            return;
        }
        // take
        list.add(arr[i]);
        getSequece(i+1, list, arr);

        // not take
        list.remove(list.size()-1);
        getSequece(i+1, list, arr);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        ArrayList<Integer> list = new ArrayList<>();
        getSequece(0, list, arr);
    }
}
