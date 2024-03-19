public class Homework5_Task3 {
    public static void main(String[] args) {

        System.out.println("Celsius Fahrenheit");
        // Loops from 0 to 20 (included).
        for (int i = 0; i <= 20; i++) {
            // Prints i as a float to represent the Celsius degrees. Calls the fahrenheit method with the float of i and prints the return result.
            System.out.println((float) i + "     " + fahrenheit((float) i));
        }
    }

    /**
     * Method converts from degrees in Celsius to Fahrenheit using the math conversion formula.
     * @param celsius A float of the degrees in Celsius to be converted.
     * @return A float of the degrees in Fahrenheit
     */
    public static float fahrenheit(float celsius) {
        return (celsius * 9/5) + 32;
    }
}
