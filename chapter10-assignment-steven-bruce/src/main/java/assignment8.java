public class assignment8 {
    public static void main(String[] args) {
        // Create an array of 9 ships and use constructors or methods to input data to the fields.
        // First 3 are Ships, with name and year.
        Ship[] ships = new Ship[9];
        ships[0] = new Ship();
        ships[0].setName("Party Boat");
        ships[0].setYear("1992");
        ships[1] = new Ship("Super Yacht", "2010");
        ships[2] = new Ship("Boaty McBoatface", "2017");
        // Next 3 are Cruise Ships with name and number of passengers it can carry.
        ships[3] = new CruiseShip();
        ships[3].setName("Tiny");
        ships[3].setPassengers(1000);
        ships[4] = new CruiseShip("Circus", 4500);
        ships[5] = new CruiseShip("Royals", 7200);
        // Last 3 are Cargo Ships with name and maximum cargo capacity in tonnes.
        ships[6] = new CargoShip();
        ships[6].setName("Tug");
        ships[6].setTonnage(5000);
        ships[7] = new CargoShip("Big Yoshi", 49000);
        ships[8] = new CargoShip("King of the Seas", 158000);

        // Loop through all ships and for each ship prints out its information
       for (Ship ship : ships) {
           // toString is called implicitly, but because we wrote our own that's different for each type of ship,
           // it prints the correct information for each different superclass/subclass.
           System.out.println(ship);
       }

    }
}
