public class Car_Test {
    public static void main(String[] args) {
        // Create a car object with a year and make
        Car speedster = new Car(2024, "Audi");

        // Loop 10 times, the first 5 calling accelerate to increase the speed and print it out each time.
        // Then 5 more times calling brake to reduce the speed and print it out each time.
        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                speedster.accelerate();
                System.out.println("The " + speedster.getMake() + " is currently going " + speedster.getSpeed() + "mph.");
            } else {
                speedster.brake();
                System.out.println("The " + speedster.getMake() + " is currently going " + speedster.getSpeed() + "mph.");
            }
        }
    }
}