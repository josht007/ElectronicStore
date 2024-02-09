import java.util.*;

public class ElectronicStoreTester {
    public static void main(String[]args){
        ElectronicStore gamestop = new ElectronicStore("gamestop");
        gamestop.printStock();

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("\nEnter a word:");
            String user = scan.nextLine();
            if(user.equals("quit")){
                break;
            }else{
                if (gamestop.searchStock(user)){
                    System.out.print("A matching item is contained in the store's stock");
                }else{
                    System.out.print("No items in the store's stock match that term.");
                }

            }
        }

    }

}
