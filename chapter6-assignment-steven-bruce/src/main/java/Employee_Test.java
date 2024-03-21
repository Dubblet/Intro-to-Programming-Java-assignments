public class Employee_Test {
    public static void main(String[] args) {
        // Create 3 employee objects using all 3 overrides of the constructor
        Employee employee1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee employee2 = new Employee("Mark Jones", 439119);
        Employee employee3 = new Employee();

        // Use the setter methods to fill out the missing data from employee 2 and 3
        employee2.setDepartment("IT");
        employee2.setPosition("Programmer");
        employee3.setName("Joy Rogers");
        employee3.setIdNumber(81774);
        employee3.setDepartment("Manufacturing");
        employee3.setPosition("Engineer");

        // Print out grid labels and the results of calling the display method for each employee
        System.out.println("Name | ID Number | Department | Position");
        System.out.println(display(employee1));
        System.out.println(display(employee2));
        System.out.println(display(employee3));
    }

    /**
     * Display method combines the 4 employee getter methods formatted into one string to reduce duplicated code.
     * @param employee Takes in one of the employee objects created above.
     * @return A string of all the data on an employee for easier print out.
     */
    public static String display(Employee employee) {
        return employee.getName() + " | " + employee.getIdNumber() + " | " + employee.getDepartment() + " | " + employee.getPosition();
    }
}