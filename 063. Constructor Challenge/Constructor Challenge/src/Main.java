public class Main {
    public static void main(String[] args) {
        Customer YashCustomer = new Customer();
        System.out.println("Name = "+YashCustomer.getName());
        System.out.println("Credit Limit = "+YashCustomer.getCreditLimit());
        System.out.println("Email = "+YashCustomer.getEmailaddress());

        System.out.println();

        Customer YashasviCustomer = new Customer("Yashasvi Yadav","yashasvi1582.be21@chitkara.edu.in");
        System.out.println("Name = "+YashasviCustomer.getName());
        System.out.println("Credit Limit = "+YashasviCustomer.getCreditLimit());
        System.out.println("Email = "+YashasviCustomer.getEmailaddress());

        System.out.println();

        Customer AbhinavCustomer = new Customer("Abhinav",1000, "Abhinav1612.be21@chitkara.edu.in");
        System.out.println("Name = "+AbhinavCustomer.getName());
        System.out.println("Credit Limit = "+AbhinavCustomer.getCreditLimit());
        System.out.println("Email = "+AbhinavCustomer.getEmailaddress());
    }
}
