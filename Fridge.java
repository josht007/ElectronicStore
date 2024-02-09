public class Fridge {
    double size;
    boolean freezer;
    String color;

    public Fridge(double size, boolean freezer, String color){
        this.size = size;
        this.freezer = freezer;
        this.color = color;
    }

    @Override
    public String toString() {
        String compartment;
        if (freezer){
            compartment = " with Freezer";
        }else{
            compartment = "";
        }
        return String.format("%.1f cubic feet Fridge%s (%s)", size, compartment, color );
    }

    public static void main(String[]args){
        Fridge test1 = new Fridge(15.6, true, "Gray");
        Fridge test2 = new Fridge(10.5, false, "White");
        System.out.println(test1);
        System.out.println(test2);
    }
}
