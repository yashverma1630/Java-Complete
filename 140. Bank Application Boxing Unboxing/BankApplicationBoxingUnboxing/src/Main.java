import java.util.*;
record Customer(String name, ArrayList<Double> transactions){ // record class for getting customer name and transactions
    public Customer(String name, double initialDeposit){ // customer name and initial deposit
        this(name.toUpperCase(),new ArrayList<Double>(500));
        transactions.add(initialDeposit); // it will add initial deposit ammount to customer
    }
}
public class Main {
    public static void main(String[] args) {
        Customer bob = new Customer("Bob S", 1000.0); // simply a customer created.
        System.out.println(bob); // simply prints the object

        Bank bank = new Bank("Chase"); // name of the bank (Object Created)
        bank.addNewCustomer("Jane A", 500.0); // new customer added to bank by using the method addNewCustomer
        System.out.println(bank);

        bank.addTransaction("Jane A", -10.25); // new transaction debited from the method addTransaction
        bank.addTransaction("jane A", -75.01); // new transaction debited from the method addTransaction
        bank.printStatement("Jane a"); // it will print mini statement of the bank from the method printStatement

        bank.addNewCustomer("bob s",25); // new customer will be added with initial deposit from the method addNewCustomer
        bank.addTransaction("Bob S", 100); // new transaction credited from the method addTransaction
        bank.printStatement("Bob S"); // it will print ministatement from the method printStatment

    }
}

class Bank {
    private String name; // name of the bank
    private ArrayList<Customer> customers = new ArrayList<>(5000); // creating arraylist of objects of class Customer

    public Bank(String name){ // constructor to add name of the bank.
        this.name = name;
    }

    private Customer getCustomer(String customerName){ // method to check if customers array list has the entered customer name or not
        for(var customer: customers){ // for loop to iterate through customers arraylist
            if(customer.name().equalsIgnoreCase(customerName)){
                return customer; // returns the object
            }
        }
        System.out.printf("Customer (%s) wasn't found %n", customerName);
        return null; // if customer not found then returns null
    }

    public void addNewCustomer(String customerName, double initialDeposit){ // Method: if customer not found then initiate new customer in Customer record
        if(getCustomer(customerName)==null){
            Customer customer = new Customer(customerName, initialDeposit);
            customers.add(customer);
            System.out.println("new Customer added : "+customer);
        }
    }

    @Override
    public String toString() { // to print name of bank and customers object
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    public void addTransaction(String name, double transactionAmount){
        Customer customer = getCustomer(name); // gets name of the customer from Customer record
        if(customer != null){
            customer.transactions().add(transactionAmount); // if found then add transaction to that name.
        }
    }

    public void printStatement(String customerName) { // it prints the statement with transaction.
        Customer customer = getCustomer(customerName);
        if(customer == null){
            return;
        }

        System.out.println("-".repeat(30));
        System.out.println("Customer Name: "+customer.name());
        System.out.println("Transactions: ");
        for(double d:customer.transactions()){
            System.out.printf("$%10.2f (%s)%n", d, d < 0?"debit": "credit");
        }
    }
}
