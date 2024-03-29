public class AccountValidation {
    // Field
    private final int[][] accountNumbers = new int[3][6];

    /**
     * Constructor with no params, fills out the whole array with static values.
     */
    public AccountValidation() {
        accountNumbers[0][0] = 5658845;
        accountNumbers[0][1] = 4520125;
        accountNumbers[0][2] = 7895122;
        accountNumbers[0][3] = 8777541;
        accountNumbers[0][4] = 8451277;
        accountNumbers[0][5] = 1302850;
        accountNumbers[1][0] = 8080152;
        accountNumbers[1][1] = 4562555;
        accountNumbers[1][2] = 5552012;
        accountNumbers[1][3] = 5050552;
        accountNumbers[1][4] = 7825877;
        accountNumbers[1][5] = 1250255;
        accountNumbers[2][0] = 1005231;
        accountNumbers[2][1] = 6545231;
        accountNumbers[2][2] = 3852085;
        accountNumbers[2][3] = 7576651;
        accountNumbers[2][4] = 7881200;
        accountNumbers[2][5] = 4581002;
    }

    /**
     *  Loops through the 2D array row by row, then nested loop to go through each element in the row,
     *   and repeats until a match is found or every element in the array has been checked.
     * @param testNumber User entered number to compare against the accountNumbers.
     * @return a boolean, true if there is a match, false if not.
     */
    public boolean validate(int testNumber) {
        for (int[] accountNumbersRow : accountNumbers) {
            for (int accountNumber : accountNumbersRow) {
                if (testNumber == accountNumber) {
                    return true;
                }
            }
        }
        return false;
    }
}
