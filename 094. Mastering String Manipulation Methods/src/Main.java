public class Main {
    public static void main(String[] args) {
        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982"); //starting index of the string
        System.out.println("startingIndex = "+ startingIndex); //just prints the starting index
        System.out.println("Birth year = " + birthDate.substring(startingIndex)); // returns the string that is inside the string

        System.out.println("Month = "+ birthDate.substring(3, 5)); //print the month from the date but not including the 5th index.

        String newDate = String.join("/", "25", "11", "1982"); // it adds the delimter between the strings separated by comas.
        System.out.println("newDate = " + newDate);

        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1982");
        System.out.println("newDate = "+newDate); // big concatination (or addition of data into string)

        newDate = "25" + "/" + "11" + "/" + "1982"; // just for understanding how it works.
        System.out.println("newDate = "+ newDate);

        newDate = "25".concat("/").concat("11").concat("/").concat("1982"); // other way to concat we won't use it mostly
        System.out.println("newDate = "+newDate);

        System.out.println(newDate.replace('/', '-')); // it replaces '/' with character '-'
        System.out.println(newDate.replace("2", "00")); // it replaces "2" string to "00" string.

        System.out.println(newDate.replaceFirst("/", "-")); // it just finds the 1st string from the whole string and replaces
        System.out.println(newDate.replaceAll("/", "---" )); // it replaces all the matched string

        System.out.println("ABC\n".repeat(3)); // repeats the code 3 times and \n is used to go the next line
        System.out.println("-".repeat(20)); // it simply repeats the code into the same line.

        System.out.println("ABC\n".repeat(3).indent(8)); // adds 8 spaces before the string. or we can say string indented to 8 spaces.
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(3).indent(-2)); // I added 4 spaces before the string and now I used -2 to remove the 2 spaces. now it will print only 2 spaces.
        System.out.println("-".repeat(20));
    }
}
