public class Main {
    public static void main(String[] args) {
        Account account = new Account();

        account.setAccountHolder("Yash Verma");
        account.setAccountNumber("12345");
        account.setBalance(115000);

        System.out.println("Initial Account Details");
        System.out.println("Account Holder Name : "+account.getAccountHolder()+"\n"+
                "Account Number : "+account.getAccountNumber()+"\n"+
                "Balance : "+account.getBalance());

        System.out.println();

        account.deposit(15000);
        System.out.println("Account details after adding money");
        System.out.println("Account Holder Name : "+account.getAccountHolder()+"\n"+
                "Account Number : "+account.getAccountNumber()+"\n"+
                "Balance : "+account.getBalance());

        System.out.println();

        account.withdraw(5000);
        System.out.println("Account details after withdrawl");
        System.out.println("Account Holder Name : "+account.getAccountHolder()+"\n"+
                "Account Number : "+account.getAccountNumber()+"\n"+
                "Balance : "+account.getBalance());
    }
}
