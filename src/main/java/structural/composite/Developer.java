package structural.composite;

/**
 * Developer - leaf
 *
 * @author Milan Rathod
 */
public class Developer implements Employee {

    private final String name;

    private final String designation;

    public Developer(String name) {
        this.name = name;
        this.designation = "Developer";
    }

    @Override
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Designation: " + designation);
    }
}
