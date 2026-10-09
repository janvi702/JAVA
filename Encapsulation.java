//Employee.java 
class Employee { 
// Private data members (Encapsulation) 
private int empId; 
private String name; 
private double salary; 
// Constructor 
Employee(int empId, String name, double salary) { 
this.empId = empId; 
this.name = name; 
this.salary = salary; 
} 
// Getter and Setter methods 
public int getEmpId() { 
return empId; 
} 
public void setEmpId(int empId) { 
this.empId = empId; 
} 
public String getName() { 
return name; 
} 
public void setName(String name) { this.name = name; 
} 
public double getSalary() { 
return salary; 
} 
public void setSalary(double salary) { 
this.salary = salary; 
} 
// Display employee details 
void display () { 
System.out.println("Employee ID: " + empId); 
System.out.println("Name: " + name); 
System.out.println("Salary: " + salary); 
} 
public static void main(String[] args) { 
// Creating an Employee object 
Employee emp = new Employee(101, "John Doe", 50000); 
// Displaying employee details 
emp.display (); 
// Modifying employee details using setters 
emp.setSalary(55000); 
System.out.println("Updated Salary: " + emp.getSalary()); 
} 
}  
