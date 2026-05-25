public class Main {
    public static void main(String[] args) {
        int currentyear = Integer.parseInt(System.console().readLine("What is current year ? "));
        try {
            System.out.print(getInputFromConsole(currentyear));
        }catch(NullPointerException e){
            System.out.print(getInputFromConsole(currentyear));
        }

    }

    public static String getInputFromConsole(int currentyear){
        String name = System.console().readLine("Hi! What's your name ? ");
        System.out.println("Hi! "+name+". Thanks for joining the course ...");
        String yearofbirth = System.console().readLine("What's your year of birth ? ");
        int age = currentyear - Integer.parseInt(yearofbirth);
        return (name +",your age is "+ age);
    }
    public static String getInputFromScanner(int currentyear){
        return "";
    }
}
