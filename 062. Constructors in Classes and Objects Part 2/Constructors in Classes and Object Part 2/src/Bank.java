public class Bank {
    private String accountnumber;
    private Double accountbalance;
    private String customername;
    private String email;
    private String phonenumber;

    public Bank(){
        this("2110991581",50000.0,"Yash","yash1495.be21@chitkara.edu.in","8198888503");
        System.out.println("Empty Constructor Called !!!");
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

    public Bank(String customername, String email, String phonenumber) {
        this("205720650",9999.0,customername,email,phonenumber);
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
