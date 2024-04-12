public class Ship {
    // Fields
    private String name;
    private String year;

    // Constructor with no params
    public Ship() {}

    // Constructor with params for a name and year a ship was built.
    public Ship(String name, String year) {
        this.name = name;
        this.year = year;
    }

    // Constructor  with params for  just a ship's name, to be used in subclasses.
    public Ship(String name) {
        this.name = name;
    }

    /**
     * Getter for name
     * @return Ship's name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name
     * @param name A name for the ship.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for year
     * @return Year ship was built
     */
    public String getYear() {
        return year;
    }

    /**
     * Setter for year
     * @param year A build year for the ship.
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * Combines the name and year into a single String.
     * @return A String with the ship's name and year built.
     */
    public String toString() {
        return "Ship Name: " + getName() + " | Year built: " + getYear();
    }

    /**
     * Setter for Passengers, not used by Ship. Only for Overriding,
     * CruiseShip needs this method in the superClass in order to call setPassengers in an array of Ships
     * @param passengers number of passengers
     */
    public void setPassengers(int passengers) {
    }

    /**
     * Setter for Tonnage, not used by Ship. Only for Overriding,
     * CargoShip needs this method in the superClass in order to call setTonnage in an array of Ships
     * @param tonnage tonnage limit
     */
    public void setTonnage(int tonnage) {
    }

}
