public class ElectronicStore {
    String name;
    Desktop desktop1;
    Desktop desktop2;
    Desktop desktop3;
    Laptop laptop1;
    Laptop laptop2;
    Laptop laptop3;
    Fridge fridge1;
    Fridge fridge2;
    Fridge fridge3;
    Desktop[] desktops;
    Laptop[] laptops;
    Fridge[] fridges;


    public ElectronicStore(String name){
        this.name = name;
        desktop1 = new Desktop(2.5,8, 250, false);
        desktop2 = new Desktop(7.0, 16, 750, true);
        desktop3 = new Desktop(5.1,64, 1000, false);
        laptop1 = new Laptop(2.5, 8, 250, false, 15);
        laptop2 = new Laptop(3.0, 8, 500, true, 13);
        laptop3 = new Laptop(4.1, 16, 1000, true, 15);
        fridge1 = new Fridge(15.6, true, "grey");
        fridge2 = new Fridge(12.5, true, "white");
        fridge3 = new Fridge(14, false, "white");
        this.desktops = new Desktop[]{desktop1, desktop2, desktop3};
        this.laptops = new Laptop[]{laptop1, laptop2, laptop3};
        this.fridges = new Fridge[]{fridge1, fridge2, fridge3};
    }

    public void printStock(){
        System.out.println("Desktops:");
        for (int i = 0; i < desktops.length; i++){
            System.out.println(" " + desktops[i]);
        }
        System.out.println("\nLaptops:");
        for (int i = 0; i < laptops.length; i++){
            System.out.println(" " + laptops[i]);
        }
        System.out.println("\nFridges:");
        for (int i = 0; i < fridges.length; i++){
            System.out.println(" " + fridges[i]);
        }
    }

    public boolean searchStock(String c) {
        for (int i = 0; i < desktops.length; i++) {
            if (desktops[i].toString().toLowerCase().contains(c.toLowerCase())) {
                return true;
            }
            if (laptops[i].toString().toLowerCase().contains(c.toLowerCase())) {
                return true;
            }
            if (fridges[i].toString().toLowerCase().contains(c.toLowerCase())) {
                return true;
            }

        }
        return false;
    }
}