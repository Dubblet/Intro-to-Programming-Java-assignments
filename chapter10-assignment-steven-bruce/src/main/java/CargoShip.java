public class CargoShip extends Ship{
    // Field
    private int tonnage;

    // Constructor with no params
    public CargoShip() {
    }

    // Constructor with params for name and maximum tonnage, calling super for name.
    public CargoShip(String name, int tonnage) {
        super(name);
        this.tonnage = tonnage;
    }

    /**
     * Getter for tonnage
     * @return The maximum cargo capacity for the ship.
     */
    public int getTonnage() {
        return tonnage;
    }

    /**
     * Setter for tonnage
     * @param tonnage The tonnage limit for a ship.
     */
    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    /**
     * Combines the name and cargo capacity into a single String.
     * @return A String with the ship's name and maximum tonnage.
     */
    public String toString() {
        return "Ship Name: " + getName() + " | Cargo Capacity (tonnage): " + getTonnage();
    }
}
