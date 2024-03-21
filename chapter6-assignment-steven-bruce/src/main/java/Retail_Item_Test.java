public class Retail_Item_Test {
    public static void main(String[] args) {
        // Create 3 objects for the 3 types of retail items
        RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
        RetailItem item2 = new RetailItem("Designer Jeans", 40, 34.95);
        RetailItem item3 = new RetailItem("Shirt", 20, 24.95);

        // Print out the grid labels and the results of calling saleDisplay for all 3 items
        System.out.println(" # | Description | Units on Hand | Price");
        System.out.println("Item #1 | " + saleDisplay(item1));
        System.out.println("Item #2 | " + saleDisplay(item2));
        System.out.println("Item #3 | " + saleDisplay(item3));
    }

    /**
     * saleDisplay method takes the 3 RetailItem getter methods and formats the returns into a single string for easier output.
     * @param item Takes in one of the RetailItem objects created above.
     * @return A String, with formatting for easier output with less duplicated code.
     */
    public static String saleDisplay(RetailItem item) {
        return item.getDescription() + " | " + item.getUnitsOnHand() + " | $" + item.getPrice();
    }
}