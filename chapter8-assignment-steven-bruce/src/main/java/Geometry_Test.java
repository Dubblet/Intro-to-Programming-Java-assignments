import java.util.Scanner;

public class Geometry_Test {
    public static void main(String[] args) {
        // Create the initial choice for the user with a text block and take in their response.
        Scanner numPad = new Scanner(System.in);
        System.out.println("""
                Geometry Calculator
                (1) Calculate the Area of a Circle
                (2) Calculate the Area of a Rectangle
                (3) Calculate the Area of a Triangle
                (4) Quit
                
                Enter your choice (1-4):""");
        int choice = numPad.nextInt();

        // An if/else-if/else chain for each result the user could give.
        if (choice == 1) {
            Scanner numPadRadi = new Scanner(System.in);
            System.out.println("Enter the Radius of the Circle:");
            double radi = numPadRadi.nextDouble();
            // Take in a radius from the user.

            // Use it to call circleArea, calculate the area of a circle, and print it out.
            System.out.println("The Area of a Circle with radius " + radi + " is: " + Geometry.circleArea(radi));

        } else if (choice == 2) {
            Scanner numPadLen = new Scanner(System.in);
            System.out.println("Enter the Length of the Rectangle:");
            double len = numPadLen.nextDouble();

            Scanner numPadWid = new Scanner(System.in);
            System.out.println("Enter the Width of the Rectangle:");
            double wid = numPadWid.nextDouble();
            // Take in a length and width from the user.

            // Use them to call rectangleArea, calculate the area of a rectangle, and print it out.
            System.out.println("The Area of a Rectangle with length " + len + " and width " + wid + " is: "
                    + Geometry.rectangleArea(len, wid));

        } else if (choice == 3) {
            Scanner numPadBase = new Scanner(System.in);
            System.out.println("Enter the Base of the Triangle:");
            double base = numPadBase.nextDouble();

            Scanner numPadHei = new Scanner(System.in);
            System.out.println("Enter the Height of the Triangle:");
            double hei = numPadHei.nextDouble();
            // Take in a base and height from the user.

            // Use them to call triangleArea, calculate the area of a triangle, and print it out.
            System.out.println("The Area of a Triangle with base " + base + " and height " + hei + " is "
                    + Geometry.triangleArea(base, hei));

        } else if (choice == 4) {
            // If the user enters 4, simply exit the program with a 0.
            System.exit(0);

        } else {
            // If the user enters any other number than 1-4, throws an error message.
            throw new IllegalArgumentException("Only accepts numbers 1-4 for directions!");
        }
    }
}
