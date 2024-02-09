public class Desktop {
    double CPU;
    int RAM;
    int storage;
    boolean SSD;

    public Desktop(double CPU, int RAM, int storage, boolean SSD){
        this.CPU = CPU;
        this.RAM = RAM;
        this.storage = storage;
        this.SSD = SSD;
    }

    @Override
    public String toString() {
        String drive;
        if (SSD){
            drive = "SSD";
        }else{
            drive =  "HDD";
        }

        return String.format("Desktop PC with %.1fghz CPU, %dGB RAM, %d%s drive.", CPU, RAM, storage, drive );
    }

    public static void main(String[]args){
        Desktop first = new Desktop(3.5, 8, 500, false);
        Desktop second = new Desktop(3.0, 16, 250, true);
        System.out.println(first);
        System.out.println(second);
    }
}
