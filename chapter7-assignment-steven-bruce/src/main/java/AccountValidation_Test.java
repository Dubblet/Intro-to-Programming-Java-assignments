import java.util.Scanner;

public class AccountValidation_Test {
    public static void main(String[] args) {
        // Creates an AccountValidation object, so we can call its method validate later.
        AccountValidation acctsDatabase = new AccountValidation();
        // Takes user input of a number to test against the AccountValidation array.
        Scanner numpad = new Scanner(System.in);
        System.out.println("Enter your 7 digit account number for validation");
        int acctNum = numpad.nextInt();

        // Calls validate method, and print if the number is valid or not based off the result true or false.
        if (acctsDatabase.validate(acctNum)) {
            System.out.println("Your account number " + acctNum + " is valid!");
        } else {
            System.out.println("Your account number was not able to be validated.");
        }
    }
}
