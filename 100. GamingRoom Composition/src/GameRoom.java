//Base class (starting class) and it has other 4 classes and this is called composition.
//composition is (has a) relation.
public class GameRoom {
    private Desk desk;
    private Monitor monitor;
    private CPU cpu;
    private Accessories accessories;

    public GameRoom(Desk desk, Monitor monitor, CPU cpu, Accessories accessories) {
        this.desk = desk;
        this.monitor = monitor;
        this.cpu = cpu;
        this.accessories = accessories;
    }

//    these are getter methods.
    public Desk getDesk() {
        desk.deskCustomize(); // calling method from desk class using its object variable. similarly done in below getter as well.
        return desk;
    }

    public Monitor getMonitor() {
        monitor.monitorSpecification();
        return monitor;
    }

    public CPU getCpu() {
        cpu.cpuSpecification();
        return cpu;
    }

    public Accessories getAccessories() {
        accessories.gamingAccessories();
        return accessories;
    }
}

//Things required to build gaming room.
class Desk{
    private String height;
    private String width;

    public Desk(String height, String width) {
        this.height = height;
        this.width = width;
    }

    public void deskCustomize(){
        this.height=height;
        this.width=width;
        System.out.println("***** Gaming Desk *****");
        System.out.format("Your custom gaming desk has height %s and width %s",height,width);
        System.out.println();
        System.out.println();
    }
}

class Monitor {
    private String brand;
    private String display;
    private String refreshRate;

    public Monitor(String brand, String display, String refreshRate) {
        this.brand = brand;
        this.display = display;
        this.refreshRate = refreshRate;
    }

    public void monitorSpecification(){
        this.brand = brand;
        this.display = display;
        this.refreshRate = refreshRate;
        System.out.println("***** Monitor Specification ***** \n"+
                "Monitor Brand : "+brand+"\n"+
                "Monitor Display : "+ display+"\n"+
                "Monitor Refresh Rate : "+refreshRate+"\n");
    }
}

class CPU {
    private String cpuBrand;
    private String cpuProcessor;
    private String cpuRam;
    private String cpuGraphics;

    public CPU(String cpuBrand, String cpuProcessor, String cpuRam, String cpuGraphics) {
        this.cpuBrand = cpuBrand;
        this.cpuProcessor = cpuProcessor;
        this.cpuRam = cpuRam;
        this.cpuGraphics = cpuGraphics;
    }

    public void cpuSpecification(){
        this.cpuBrand =cpuBrand;
        this.cpuProcessor = cpuProcessor;
        this.cpuRam = cpuRam;
        this.cpuGraphics = cpuGraphics;

        System.out.println("***** CPU Specifications ***** \n" +
                "CPU Brand : "+cpuBrand+"\n"+
                "CPU Processor : "+cpuProcessor+"\n"+
                "CPU Ram : "+cpuRam+"\n"+
                "CPU Graphics : "+cpuGraphics+"\n");
    }
}

class Accessories{
    private String keyboard;
    private String mouse;
    private String headphones;

    public Accessories(String keyboard, String mouse, String headphones) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.headphones = headphones;
    }

    public void gamingAccessories(){
        this.keyboard =keyboard;
        this.mouse = mouse;
        this.headphones = headphones;

        System.out.println("***** Gaming Accessories ***** \n" +
                "Gaming Keyboard : "+keyboard+"\n"+
                "Gaming Mouse : "+mouse+"\n"+
                "Gaming Headphones : "+headphones);
    }
}
