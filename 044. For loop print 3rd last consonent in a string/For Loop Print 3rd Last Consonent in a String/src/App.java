import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print(FindConsonent("cabedo"));
    }
    public static char FindConsonent(String str){
        int l = str.length()-1;
        int count = 0 ;
        char f=' ';
        for(int i=l; i>=0; i--){
            if(count==2 && str.charAt(i)!='a' && str.charAt(i)!='e' && str.charAt(i)!='i' && str.charAt(i)!='o' && str.charAt(i)!='u' ){
                f=(str.charAt(i));
                break;
            }
            if(str.charAt(i)!='a' && str.charAt(i)!='e' && str.charAt(i)!='i' && str.charAt(i)!='o' && str.charAt(i)!='u'){
                count++;
            }
        }
        return f;
    }
}
