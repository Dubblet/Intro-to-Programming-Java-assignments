import java.util.Scanner;

public class Homework5_Task1 {
    public static void main(String[] args) {

        // Initialize a counter number to eventually break out of the do-while loop.
        int counter = 0;
        // Loop until the user enters -1.
        do {
            Scanner userText = new Scanner(System.in);
            System.out.println("What is your favorite city?");
            String favCity = userText.nextLine();

            Scanner userNumber = new Scanner(System.in);
            System.out.println("Enter a positive number to find out what character is at that position! (0 indexed) Enter '-1' to exit");

            // Checks to make sure the user enters a number, if not, asks for a number and loops back.
            if (userNumber.hasNextInt()) {
                int favNumber = userNumber.nextInt();
                // Next checks to make sure the user hasn't entered a number that is larger than the length of the string, or less than -1.
                if (favNumber < -1 || favNumber >= favCity.length()) {
                    System.out.println("Please enter a positive number less than the total length of your favorite city's name, or '-1' to exit");
                    // If the user enters -1, updates the counter and breaks out of the do-while loop.
                } else if (favNumber == -1) {
                    counter = favNumber;
                    // Otherwise, calls the showChar method.
                } else {
                    showChar(favCity, favNumber);
                }
            } else {
                System.out.println("Please enter a whole number, not text");
            }
        } while (counter != -1);
    }

    /**
     * Method takes the int and uses it in .charAt, which gives the character at that location (0 indexed) on the String.
     * It then prints the character out.
     * @param city The name entered by the user when prompted for their favorite city
     * @param position The number the user entered when prompted, which will be used as character positioning.
     */
    public static void showChar(String city, int position) {
        char charAtPosition = city.charAt(position);
        System.out.println(charAtPosition);
    }
}