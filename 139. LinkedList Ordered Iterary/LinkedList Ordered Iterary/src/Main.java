import java.util.*;
public class Main {
    public static void main(String[] args) {
        Place adelaide = new Place("Adelaide", 1374);
        Place aliceSprings = new Place("Alice Springs", 2771);
        Place brisbane = new Place("Brisbane", 917);
        Place darwin = new Place("Darwin", 3972);
        Place melbourne = new Place("Melbourne", 877);
        Place Perth = new Place("Perth", 3923);

        LinkedList<Place> allPlace = new LinkedList<>();

        addPlace(allPlace, adelaide);
        addPlace(allPlace, aliceSprings);
        addPlace(allPlace, brisbane);
        addPlace(allPlace, darwin);
        addPlace(allPlace, melbourne);
        addPlace(allPlace, Perth);

        allPlace.addFirst(new Place("Sydney", 0));
        System.out.println(allPlace);

        var iterator = allPlace.listIterator();
        Scanner scn = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        printMenu();

        while(!quitLoop){
            if(!iterator.hasPrevious()){
                System.out.println("Originating : "+iterator.next());
                forward = true;
            }
            if(!iterator.hasNext()){
                System.out.println("Final : "+iterator.previous());
                forward = false;
            }

            System.out.print("Enter Value: ");
            String menuItem = scn.nextLine().toUpperCase().substring(0,1);

            switch (menuItem){
                case "F":
                    System.out.println("User wants to go forward");
                    if(!forward){
                        forward=true;
                        if(iterator.hasNext()){
                            iterator.next();
                        }
                    }
                    if(iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                    break;

                case "B":
                    System.out.println("User wants to go backwards");
                    if(forward){
                        forward=false;
                        if(iterator.hasPrevious()){
                            iterator.previous();
                        }
                    }
                    if(iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                        break;
                    }
                case "M":
                    printMenu();
                    break;

                case "L":
                    System.out.println(allPlace);
                    break;

                default:
                    quitLoop = true;
                    break;
            }
        }
    }
    public static void addPlace(LinkedList<Place> list, Place place){
        for(Place p:list){
            if(p.getPlace().equalsIgnoreCase(place.getPlace())){
                System.out.println("Duplicate found !!! : "+place.getPlace());
            }
        }

        int position=0;
        for(Place pl : list){
            if(place.getDistance()<pl.getDistance()){
                list.add(position, place);
                return;
            }
            position++;
        }
        list.add(place);
    }

    private static void printMenu(){
        System.out.println("""
                Available actions (select word or Letter).
                (F)orward
                (B)ackwards
                (L)ist Places
                (M)enu
                (Q)uit""");
    }
}
class Place{
    private String place;
    private int distance;

    public Place(String place, int distance) {
        this.place = place;
        this.distance = distance;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "[" + place + " ("+distance +")"+"]";
    }
}

