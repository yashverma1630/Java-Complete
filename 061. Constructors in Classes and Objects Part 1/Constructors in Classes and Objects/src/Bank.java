public class Bank {
    private String accountnumber;
    private Double accountbalance;
    private String customername;
    private String email;
    private String phonenumber;

    public Bank(){
        System.out.println("You Defined Constructor in Class... This is not Default Constructor");
    }

    //Removed Setters from the code... instead of setters, I used constructors to assign values to Class fields
    public Bank(String accountnumber, Double accountbalance, String customername, String Email, String Phonenumber){
        System.out.println("Defining fields using constructors");
        this.accountnumber=accountnumber;
        this.accountbalance = accountbalance;
        this.customername= customername;
        email=Email;
        phonenumber=Phonenumber;
    }
    public String getAccountnumber(){
        return accountnumber;
    }

    public Double getAccountbalance() {
        return accountbalance;
    }

    public String getCustomername() {
        return customername;
    }

    public String getEmail() {
        return email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

//    public void setAccountnumber(String accountnumber){
//        this.accountnumber=accountnumber;
//    }
//
//    public void setAccountbalance(Double accountbalance) {
//        this.accountbalance = accountbalance;
//    }
//
//    public void setCustomername(String customername) {
//        this.customername = customername;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setPhonenumber(String phonenumber) {
//        this.phonenumber = phonenumber;
//    }

    public void Deposit(Double funds){
        accountbalance+=funds;
        System.out.println("Rs."+funds+"/- credited to your account!!!");
        System.out.println("Account Number: "+accountnumber);
        System.out.println("Account Balance: Rs."+accountbalance+"/-");
        System.out.println("Customer Name: "+ customername);
        System.out.println("Email: "+ email);
        System.out.println("Phone Number: "+phonenumber);
        System.out.println();
    }

    public void Withdraw(Double money){
        if(accountbalance-money<0){
            System.out.println("Sorry!!! your bank balance is low ... you cannot withdraw this much money! ");
            System.out.println("Account Balance: Rs."+accountbalance+"/-");
            System.out.println();
        }
        else{
            accountbalance-=money;
            System.out.println("Rs."+money+"/- Debited from your Account!!!");
            System.out.println("Account Number: "+accountnumber);
            System.out.println("Account Balance: Rs."+accountbalance+"/-");
            System.out.println("Customer Name: "+ customername);
            System.out.println("Email: "+ email);
            System.out.println("Phone Number: "+phonenumber);
            System.out.println();
        }
    }
}
