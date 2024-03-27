import java.util.Scanner;

public class Array_Operations {
    public static void main(String[] args) {
        // Ask for user input and get the amount of numbers they plan to enter.
        Scanner numpad = new Scanner(System.in);
        System.out.println("Enter the number of data points");
        int size = numpad.nextInt();

        // Create an array of size the user entered above.
        // Then ask them to enter numbers one at a time and assign the inputs to the array until it is filled.
        int[] dataPoints = new int[size];
        for (int i = 0; i < size; i++) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter the " + (i+1) + " data point");
            dataPoints[i] = keyboard.nextInt();
        }

        // Call each method and print out the results.
        System.out.println("The sum of the entered numbers is: " + getTotal(dataPoints));
        System.out.println("The average of the entered numbers is: " + getAverage(dataPoints));
        System.out.println("The highest number entered is: " + getHighest(dataPoints));
        System.out.println("The lowest number entered is: " + getLowest(dataPoints));
    }

    /**
     *  Adds all the numbers the user entered together.
     * @param dataPoints Takes in the array of ints the user entered.
     * @return An int, the sum of the numbers.
     */
    public static int getTotal(int[] dataPoints) {
        int total = 0;
        for (int dataPoint : dataPoints) {
            total += dataPoint;
        }
        return total;
    }

    /**
     *  Averages all the numbers the user entered.
     * @param dataPoints Takes in the array of ints the user entered.
     * @return A double, the total added up then divided by the number of data points for the average.
     */
    public static double getAverage(int[] dataPoints) {

        double total = getTotal(dataPoints);
        return total / dataPoints.length;
    }

    /**
     *  Finds the largest number out of what the user entered.
     * @param dataPoints Takes in the array of ints the user entered.
     * @return An int, the single highest data point.
     */
    public static int getHighest(int[] dataPoints) {
        int highest = dataPoints[0];
        for (int dataPoint : dataPoints) {
            if (dataPoint > highest) {
                highest = dataPoint;
            }
        }
        return highest;
    }

    /**
     *  Finds the smmallest number out of what the user entered.
     * @param dataPoints Takes in the array of ints the user entered.
     * @return An int, the single lowest data point.
     */
    public static int getLowest(int[] dataPoints) {
        int lowest = dataPoints[0];
        for (int dataPoint : dataPoints) {
            if (dataPoint < lowest) {
                lowest = dataPoint;
            }
        }
        return lowest;
    }
}
