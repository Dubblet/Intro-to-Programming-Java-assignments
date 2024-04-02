public class RoomCarpet {
    // Fields
    private RoomDimension size;
    private double carpetCost;

    // Constructor with params for a RoomDimension and a cost of carpet per square foot.
    public RoomCarpet(RoomDimension dimension, double cost) {
        size = dimension;
        carpetCost = cost;
    }

    /**
     * Calls RoomDimension's getArea to get the room area and then multiply that by the cost of carpet.
     * @return A double, the total cost of to carpet the room.
     */
    public double getTotalCost() {
        return size.getArea() * carpetCost;
    }
}
