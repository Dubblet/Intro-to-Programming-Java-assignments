import javax.swing.*;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        // Task 1
        System.out.println("=====\tTask#1\t=====\nMy name is Steven Bruce");

        // Task 2
        System.out.println("=====\tTask#2\t=====");

        Scanner firstInput = new Scanner(System.in);
        System.out.println("Enter the first integer");
        int firstInt = firstInput.nextInt();

        Scanner secondInput = new Scanner(System.in);
        System.out.println("Enter the second integer");
        int secondInt = secondInput.nextInt();

        double sum = firstInt + secondInt;
        double difference = firstInt - secondInt;
        double product = firstInt * secondInt;
        double quotient = (double) firstInt / (double) secondInt;

        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + difference);
        System.out.println("The product is: " + product);
        System.out.println("The quotient is: " + quotient);

        // Task 3
        System.out.println("=====\tTask#3\t=====");

        String firstName = JOptionPane.showInputDialog("Enter your first name");
        String lastName = JOptionPane.showInputDialog("Enter your last name");
        String age = JOptionPane.showInputDialog("Enter your age");

        JOptionPane.showMessageDialog(null, "Hello " + firstName + " " + lastName + " and you are " + age + " years old");
        System.exit(0);
    }
}
