public class RoomDimension {
    // Fields
    private double length;
    private double width;

    // Constructor with params for the length and width of a room.
    public RoomDimension(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Multiplies the length and width.
     * @return A double, the area of a room.
     */
    public double getArea() {
        return length * width;
    }
}
