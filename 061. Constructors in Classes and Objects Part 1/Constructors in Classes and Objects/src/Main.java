public class Main {
    public static void main(String[] args) {
        Bank YashsAccount = new Bank("2110991581",48.0,"Yash Verma","yash1581.be21@chitkara.edu.in","8198888503");
//        YashsAccount.setAccountnumber("2110991581");
//        YashsAccount.setAccountbalance(0.0);
//        YashsAccount.setCustomername("Yash Verma");
//        YashsAccount.setEmail("yash1581.be21@chitkara.edu.in");
//        YashsAccount.setPhonenumber("8198888503");
        System.out.println();
        System.out.println("Account Number: "+YashsAccount.getAccountnumber());
        System.out.println("Account Balance: Rs." +YashsAccount.getAccountbalance()+"/-");
        System.out.println("Customer Name: "+YashsAccount.getCustomername());
        System.out.println("Email: "+YashsAccount.getEmail());
        System.out.println("Phone Number: "+YashsAccount.getPhonenumber());
        System.out.println();

        YashsAccount.Deposit(1000.0);
        YashsAccount.Withdraw(450.0);
    }
}
