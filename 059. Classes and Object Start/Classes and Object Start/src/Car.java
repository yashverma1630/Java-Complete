public class Car {
    private String make = "Tesla";
    private String Model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    public void setMake(String make){
        if(make==null) make="unknown";
        String lowercasemake= make.toLowerCase();
        switch(lowercasemake){
            case "porsche", "tesla", "holden" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        }

    }

    public void setModel(String model) {
        Model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public String getMake(){
        return make;
    }

    public String getModel() {
        return Model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void describeCar(){
        System.out.println(
            doors+"-Door"+" "+
            color+" "+
            make + " "+
            Model + " "+
            (convertible ? "Convertible":"")
        );
    }
}
