public class Main {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            LPAStudent s = new LPAStudent("S92300"+i,switch(i){
                case 1 -> "Mary";
                case 2 -> "Carol";
                case 3 -> "Tim";
                case 4 -> "Harry";
                case 5 -> "Lisa";
                default -> "Anonymous";
            },"05/11/1985","Java Masterclass");
            System.out.println(s);
        }

        Student pojostudent = new Student("S29563","Yash Verma","30/07/2003","Java Class");
        LPAStudent recordstudent= new LPAStudent("S93265","Yashasvi Yadav","24/07/2003","Java Class");

        System.out.println();

        System.out.println(pojostudent);
        System.out.println(recordstudent);

        System.out.println();

        System.out.println(pojostudent.getName()+" is taking "+pojostudent.getClassList());
        System.out.println(recordstudent.name()+" is taking "+recordstudent.classList());

        System.out.println();
        pojostudent.setClassList("Sports");
//        recordstudent.setclassList("Sports");
// this line will throw an error because records are
// immutable that means we cannot make changes to record.
        System.out.println();
        System.out.println(pojostudent.getName()+" is taking "+pojostudent.getClassList());
        System.out.println(recordstudent.name()+" is taking "+recordstudent.classList());

        }

    }

