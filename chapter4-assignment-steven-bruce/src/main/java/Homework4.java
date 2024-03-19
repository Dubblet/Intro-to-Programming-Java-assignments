import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) throws FileNotFoundException {
        // Task 1
        // Get a number from the user and initialize a variable for the total.
        Scanner userNumber = new Scanner(System.in);
        System.out.println("Enter a positive integer to add");
        int startingNumber = userNumber.nextInt();
        int addedTotal = 0;

        // A for loop from 1 to (and including) the number input by the user.
        for (int i = 1; i <= startingNumber; i++) {
           addedTotal += i;
        }
        // Each number as it counts up is added to the total, and then printed out.
        System.out.println("The sum of 1 to " + startingNumber + " is " + addedTotal);

        // Task 2
        // Get the read file from the user and open it.
        Scanner getReadFileName = new Scanner(System.in);
        System.out.println("Enter the name of the .txt file to read from (include the .txt).");
        String readFileName = getReadFileName.nextLine();
        File file1 = new File(readFileName);
        Scanner readFile = new Scanner(file1);

        // Get the write file from the user and open it.
        Scanner getWriteFileName = new Scanner(System.in);
        System.out.println("Enter the name of the .txt file to write to (include the .txt).");
        String writeFileName = getWriteFileName.nextLine();
        PrintWriter writeFile = new PrintWriter(writeFileName);

        // Loop through the whole read file, copying each line to the write file in all UPPER CASE.
        while (readFile.hasNext()) {
            String testLine = readFile.nextLine();
            writeFile.println(testLine.toUpperCase());
        }
        readFile.close();
        writeFile.close();

        // Task 3
        // Get a day of the week from the user.
        Scanner userDay = new Scanner(System.in);
        System.out.println("Enter a day of the week, in all lowercase (e.g. monday, tuesday, etc.)");
        String dayOfTheWeek = userDay.nextLine();

        // Switch statement to print out if the entered string is a weekday, or part of the weekend.
        switch (dayOfTheWeek) {
            case "monday", "tuesday", "wednesday", "thursday", "friday":
                System.out.println(dayOfTheWeek + " is a weekday. Time for work!");
                break;
            case "saturday", "sunday":
                System.out.println(dayOfTheWeek + " is the weekend. Time to play!");
                break;
            // Default value to output if the user did not enter a weekday or mistakenly used a capital letter.
            default:
                System.out.println(dayOfTheWeek + " isn't a day of the week!");
        }
    }
}
