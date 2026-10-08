public class Main {
    public static boolean isPalindrome(String str, int i){
        if(i>= str.length()-1/2){
            return true;
        }
        if(str.charAt(i) != str.charAt(str.length()-1-i)){
            return false;
        }
        return isPalindrome(str, i+1);
    }
    public static void main(String[] args) {
        String str = "abbaa";
        System.out.println(isPalindrome(str, 0));
    }
}
