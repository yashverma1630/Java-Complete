import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.print(FindConsonent("cabedo"));
    }
    public static char FindConsonent(String str){
        int l = str.length()-1;
        int count = 0 ;
        char f=' ';
        while(l>=0){
            if(count==2 && str.charAt(l)!='a' && str.charAt(l)!='e' && str.charAt(l)!='i' && str.charAt(l)!='o' && str.charAt(l)!='u' ){
                f=(str.charAt(l));
                break;
            }
            if(str.charAt(l)!='a' && str.charAt(l)!='e' && str.charAt(l)!='i' && str.charAt(l)!='o' && str.charAt(l)!='u'){
                count++;
                l--;
            }
            else{
                l--;
            }
        }
        return f;
    }
}
