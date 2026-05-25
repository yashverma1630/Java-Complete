public class Main {
    public static void main(String[] args) {
//        Bank YashsAccount = new Bank("2110991581",48.0,"Yash Verma","yash1581.be21@chitkara.edu.in","8198888503");

        Bank YashsAccount = new Bank();
        System.out.println();
        System.out.println("Account Number: "+YashsAccount.getAccountnumber());
        System.out.println("Account Balance: Rs." +YashsAccount.getAccountbalance()+"/-");
        System.out.println("Customer Name: "+YashsAccount.getCustomername());
        System.out.println("Email: "+YashsAccount.getEmail());
        System.out.println("Phone Number: "+YashsAccount.getPhonenumber());
        System.out.println();

        YashsAccount.Deposit(1000.0);
        YashsAccount.Withdraw(450.0);

        Bank TimsAccount = new Bank("Tim","tim007.be21@chitkara.edu.in","9856783231");
        System.out.println("Account Number = "+TimsAccount.getAccountnumber());
        System.out.println("Account Balance = "+TimsAccount.getAccountbalance());
        System.out.println("Customer Name = "+TimsAccount.getCustomername());
        System.out.println("Email = "+TimsAccount.getEmail());
        System.out.println("Phone Number = "+TimsAccount.getPhonenumber());
    }
}
