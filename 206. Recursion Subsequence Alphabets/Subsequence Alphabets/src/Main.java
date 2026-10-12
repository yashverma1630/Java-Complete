import java.util.ArrayList;

public class Main {
    public static void subsequenceAlphabets(int i,StringBuilder s, ArrayList<Character> ans){
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        ans.add(s.charAt(i));
        subsequenceAlphabets(i+1,s,ans);
        ans.remove(ans.size()-1);
        subsequenceAlphabets(i+1,s,ans);
    }
    public static void main(String[] args) {
        String s = "abc";
        ArrayList<Character> ans = new ArrayList<>();
        subsequenceAlphabets(0,new StringBuilder(s),ans);
    }
}
