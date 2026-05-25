public class Account {
    private String accountNumber;
    private String accountHolder;
    private int balance;

    public void deposit(int addMoney){
        balance += addMoney;
    }

    public void withdraw(int subtractMoney){
        balance -= subtractMoney;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getBalance() {
        return balance;
    }
}
