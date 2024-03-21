public class Employee {
    // Fields
    private String name;
    private int idNumber;
    private String department;
    private String position;

    // Constructor with no params.
    public Employee() {
        name = "";
        idNumber = 0;
        department = "";
        position = "";
    }

    /**
     * Constructor override with just name and id.
     * @param name The employee's name.
     * @param idNumber The employee's id number.
     */
    public Employee(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
        department = "";
        position = "";
    }

    /**
     * Constructor override with all 4 fields entered as parameters.
     * @param name The employee's name.
     * @param idNumber The employee's id number.
     * @param department The department the employee works in.
     * @param position The employee's job position within their department.
     */
    public Employee(String name, int idNumber, String department, String position) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }

    /**
     * Getter method for name.
     * @return A String, the employee's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for name.
     * @param name The employee's name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for id number.
     * @return An int, the employee's id number.
     */
    public int getIdNumber() {
        return idNumber;
    }

    /**
     * Setter method for id number.
     * @param idNumber The employee's id number.
     */
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * Getter method for department.
     * @return A String, the employee's department.
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Setter method for department.
     * @param department The employee's department.
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Getter method for position.
     * @return A String, the employee's position.
     */
    public String getPosition() {
        return position;
    }

    /**
     * Setter method for position.
     * @param position The employee's position.
     */
    public void setPosition(String position) {
        this.position = position;
    }
}