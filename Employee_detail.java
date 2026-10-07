// Employee.java 
class Employee { 
private int id; 
private String name; 
private String designation; 
private double salary; 
// Constructor 
Employee(int id, String name, String designation, double salary) { 
this.id = id; 
this.name = name; 
this.designation = designation; 
this.salary = salary; 
} 
// Method to display employee details 
void display() { 
System.out.println("Employee Details:"); 
System.out.println("ID: " + id); 
System.out.println("Name: " + name); 
System.out.println("Designation: " + designation); 
System.out.println("Salary: ₹" + salary); 
} 
// Main method to create and run an instance 
public static void main(String[] args) { 
// Creating an Employee object 
Employee e = new Employee(101, "Ram Jadhav", "Software Engineer", 60000); 
// Displaying employee details 
e.display(); 
} 
} 
Employee e = new Employee(101, "Ram Jadhav", "Software Engineer", 60000);