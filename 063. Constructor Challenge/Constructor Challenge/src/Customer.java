public class Customer {
    private String name;
    private double creditLimit;
    private String emailaddress;

    public Customer(String name, double creditLimit, String emailaddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailaddress = emailaddress;
    }

    public Customer(){
        this("yash Verma","yash1581.be21@chitkara.edu.in");
    }

    public Customer(String name, String email){
        this(name,1000,email);
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailaddress() {
        return emailaddress;
    }
}
