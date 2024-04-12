public class CruiseShip extends Ship{
    // Field
    private int passengers;

    // Constructor with no params
    public CruiseShip() {
    }

    // Constructor with params for name and number of passengers, calling super for name.
    public CruiseShip(String name, int passengers) {
        super(name);
        this.passengers = passengers;
    }

    /**
     * Getter for passengers
     * @return The maximum passengers the ship can carry.
     */
    public int getPassengers() {
        return passengers;
    }

    /**
     * Setter for passengers
     * @param passengers number of passengers a ship can carry.
     */
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    /**
     * Combines the name and number of passengers into a single String.
     * @return A String with the ship's name and maximum passengers.
     */
    public String toString () {
        return "Ship Name: " + getName() + " | Maximum Passengers: " + getPassengers();
    }
}
