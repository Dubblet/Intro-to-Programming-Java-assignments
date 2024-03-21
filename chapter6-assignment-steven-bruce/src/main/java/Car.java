public class Car {
    // Fields
    private int yearModel;
    private String make;
    private int speed;

    // Constructor with params for yearModel and make, and sets speed to 0
    public Car(int yearModel, String make) {
        this.yearModel = yearModel;
        this.make = make;
        speed = 0;
    }

    /**
     * Getter method for yearModel.
     * @return An int, the year of the car.
     */
    public int getYearModel() {
        return yearModel;
    }

    /**
     * Setter method for yearModel.
     * @param yearModel The year of the car.
     */
    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    /**
     * Getter method for make.
     * @return A String, the brand make of the car.
     */
    public String getMake() {
        return make;
    }

    /**
     * Setter method for make.
     * @param make The brand make of the car.
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Getter method for speed.
     * @return An int, the speed the car is travelling at.
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Setter method for speed.
     * @param speed The speed the car is travelling at.
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * A method to increase the speed by 5.
     */
    public void accelerate() {
        speed += 5;
    }

    /**
     * A method to decrease the speed by 5.
     */
    public void brake() {
        speed -= 5;
    }
}