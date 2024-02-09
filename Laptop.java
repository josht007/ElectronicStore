public class Laptop {
    double CPU;
    int RAM;
    int storage;
    boolean SSD;
    int screen;

    public Laptop(double CPU, int RAM,int storage, boolean SSD, int screen){
        this.CPU = CPU;
        this.RAM = RAM;
        this.storage = storage;
        this.SSD = SSD;
        this.screen = screen;
    }

    @Override
    public String toString() {
        String drive;
        if (SSD){
            drive = "SSD";
        }else{
            drive =  "HDD";
        }
        return String.format("%d\" Laptop PC with %.1fghz CPU, %dGB RAM, %dGB %s drive. ", screen, CPU, RAM,storage, drive );
    }

    public static void main(String[]args){
        Laptop one = new Laptop(3.1, 32, 500, true, 15 );
        Laptop second = new Laptop(2.5, 8, 250, true, 13 );

        System.out.println(one);
        System.out.println(second);
    }
}
