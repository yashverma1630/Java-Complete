// ordinal() tells the index of the constants in enum.
public class Main {
    public static void main(String[] args) {
        for(FriendsName myFriends : FriendsName.values()){
            System.out.println("My Friends Name : "+myFriends+ " and its ordinal is : "+myFriends.ordinal());
        }
    }
    public enum FriendsName{
        YASHASVI, DHRUV, AAYUSH, YASH
    }
}
