import javax.swing.*;

public class Homework5_Task2 {
    public static void main(String[] args) {
        // Get the speed and time from the user in dialog boxes
        double speed = Double.parseDouble(JOptionPane.showInputDialog("Enter the speed of the vehicle (MPH)"));
        double time = Double.parseDouble(JOptionPane.showInputDialog("Enter the time in hours, how long the vehicle was travelling"));

        // Calls distanceCal to calculate the distance and print it out in a dialog box.
        JOptionPane.showMessageDialog(null, "The vehicle traveled " + distanceCal(speed, time));
    }

    /**
     * Simply multiplies the speed by the time to get the distance traveled and returns it.
     * @param speed The speed in MPH of the vehicle.
     * @param time The time the vehicle travelled at that speed.
     * @return A double equalling the distance traveled.
     */
    public static double distanceCal(double speed, double time) {
        return speed * time;
    }
}
