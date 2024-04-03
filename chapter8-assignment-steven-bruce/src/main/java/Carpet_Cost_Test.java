import java.util.Scanner;

public class Carpet_Cost_Test {
    public static void main(String[] args) {
        // Get 3 inputs from the user for the room's length & width, + the cost of the carpet
        Scanner numPad = new Scanner(System.in);
        System.out.println("Please enter the length of your room in feet:");
        double len = numPad.nextDouble();

        Scanner numPad2 = new Scanner(System.in);
        System.out.println("Please enter the width of your room in feet:");
        double wid = numPad2.nextDouble();

        Scanner numPad3 = new Scanner(System.in);
        System.out.println("Please enter the price of the carpet per square foot:");
        double price = numPad3.nextDouble();

        // Create objects for both RoomDimension and RoomCarpet, and fill them with the user's inputs.
        RoomDimension roomSize = new RoomDimension(len, wid);
        RoomCarpet roomCost = new RoomCarpet(roomSize, price);
        // Print out the total cost.
        System.out.println("For your room with a length of " + len + " ft, a width of " + wid + " ft, and your carpet" +
                " of choice costing $" + price + " per square foot, your total cost is: $" + roomCost.getTotalCost());
    }
}
