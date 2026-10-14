import java.util.Scanner;

// Employee class definition
class Employee {
    int id;
    String name;
    String designation;
    double salary;

    // Constructor to initialize employee details
    public Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    // Method to display employee details
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Designation: " + designation + ", Salary: $" + salary);
    }
}

// Main class
public class EmployeeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking the user for the number of employees
        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Creating an array of Employee objects
        Employee[] employees = new Employee[numEmployees];

        // Accepting user input for each employee
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");

            System.out.print("Enter Employee ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter Employee Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Employee Designation: ");
            String designation = scanner.nextLine();

            System.out.print("Enter Employee Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            // Initializing the employee object
            employees[i] = new Employee(id, name, designation, salary);
        }

        // Displaying all employee details
        System.out.println("\nEmployee Details:");
        for (Employee emp : employees) {
            emp.display();
        }

        scanner.close(); // Closing the scanner
    }
}
