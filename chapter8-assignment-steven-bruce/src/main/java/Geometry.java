public class Geometry {
    // All methods have error handling throwing an exception if a param is a negative number.
    /**
     * Static method that multiplies a given radius by PI.
     * @param radius The radius of a circle.
     * @return A double, the area of a circle.
     */
    public static double circleArea(double radius) {
        if (radius > 0) {
            return Math.PI * radius;
        } else {
            throw new IllegalArgumentException("Only accepts positive numbers for the radius!");
        }
    }

    /**
     * Static method that multiples a given length and width together.
     * @param length The length of a rectangle.
     * @param width The width of a rectangle.
     * @return A double, the area of a rectangle.
     */
    public static double rectangleArea(double length, double width) {
        if (length > 0 && width > 0) {
            return length * width;
        } else {
            throw new IllegalArgumentException("Only accepts positive numbers for the length and width!");
        }
    }

    /**
     * Static method that multiplies a given base and height together and then cuts the result in half.
     * @param base The length of the base of a triangle.
     * @param height The height of a triangle.
     * @return A double, the area of a triangle.
     */
    public static double triangleArea(double base, double height) {
        if (base > 0 && height > 0) {
            return base * height * 0.5;
        } else {
            throw new IllegalArgumentException("Only accepts positive numbers for the base and height!");
        }
    }

}
