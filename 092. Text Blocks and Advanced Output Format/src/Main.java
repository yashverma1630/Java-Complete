public class Main {
    public static void main(String[] args) {
//        \n is for new line.
//        \t is for tab.
//        \" insert a double quote character.
//        \\ insert a backslash character.
        String bulletIt = "Print a Bulleted List: \n"+
                "\t\u2022 First Point\n"+
                "\t\t\u2022 Sub Point";
        System.out.println(bulletIt);

//        Another way to achieve this is text block

        String textBlock = """
                Print a Bulleted List:
                    \u2022 First Point
                        \u2022 Sub Point
                """;
        System.out.println(textBlock);

//        formatting numbers into text.
//        System.out.printf();
//        System.out.format();

//        %d is for inserting integer, short or long.
//        %f is for inserting floating numbers. ex. float or double.
//        %n is also used for newline.
        int age = 35;
        System.out.printf("Your age is %d%n", age);

        int yearOfBirth = 2023-age;
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);

        System.out.printf("Your age is %.2f%n", (float)age);
//        as you can see there is %.2f in above code. this will show only 2 digits after decimal.
//        if you remove .2 from the code, it will display 6 zeros.
        for(int i = 1; i<=10000; i *= 10) {
            System.out.printf("Printing %6d %n", i);
        }
//        so as you can see there is 6 between %d. this ensures that there must be
//        6 characters to be printed rest of the empty space will be filled by spaces.

//        both works the same. these are just different ways to format number.
        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);
    }
}
