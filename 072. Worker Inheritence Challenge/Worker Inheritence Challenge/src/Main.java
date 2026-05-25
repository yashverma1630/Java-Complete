public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("yash", "30-07-2003", "24-08-2024");
        System.out.print(worker);
        System.out.print(worker.getAge());
    }
}

class Worker{
    private String name;
    private String birthDate;
    private String endDate;

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    int getAge(){
        int currentYear = 2024;
        int birthdate = Integer.parseInt(birthDate.substring(7));
        return(currentYear-birthdate);
    }

    double collectPay(){
        return 0.0;
    }

    void terminate(String endDate){
        this.endDate=endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
