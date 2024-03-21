public class RetailItem {
    // Fields
    private String description;
    private int unitsOnHand;
    private double price;

    // Constructor that takes parameters for all 3 fields
    public RetailItem(String description, int unitsOnHand, double price) {
        this.description = description;
        this.unitsOnHand = unitsOnHand;
        this.price = price;
    }

    /**
     * Getter method for description.
     * @return A String, a description or name of the item.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter method for description.
     * @param description A description or name of the item.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter method for unitsOnHand.
     * @return An int, the number of units of the item available.
     */
    public int getUnitsOnHand() {
        return unitsOnHand;
    }

    /**
     * Setter method for unitsOnHand.
     * @param unitsOnHand The number of units of the item available.
     */
    public void setUnitsOnHand(int unitsOnHand) {
        this.unitsOnHand = unitsOnHand;
    }

    /**
     * Getter method for price.
     * @return A double, the cost of the item.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Setter method for price.
     * @param price The cost of the item.
     */
    public void setPrice(double price) {
        this.price = price;
    }
}