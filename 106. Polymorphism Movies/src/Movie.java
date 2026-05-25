public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName(); // these are pre-defined java methods simply picks up the name of class in which this method is and stores into a string variable
        System.out.println(title + " is a "+ instanceType + " film");
    }
}

class Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie(){
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),"Pleasant Scene", "Scary Music","Something Bad Happens");
//        %s is to print string and %n is for next line. repeat 3 will repeat that %s and %n 3 times.
    }
}

class Comedy extends Movie {
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie(){
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Something funny happens",
                "Something even funnier happens",
                "Happy Ending");
//        %s is to print string and %n is for next line. repeat 3 will repeat that %s and %n 3 times.
    }
}

class ScienceFiction extends Movie {
    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie(){
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Bad Aliens do Bad Stuff",
                "Space Guys Chase Aliens",
                "Planets Blows Up");
//        %s is to print string and %n is for next line. repeat 3 will repeat that %s and %n 3 times.
    }
}