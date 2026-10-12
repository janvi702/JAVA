// Parent class representing a general Vehicle 
class Vehicle { 
String brand; 
int speed; 
public Vehicle(String brand, int speed) { 
this.brand = brand; 
this.speed = speed; 
} 
public void showDetails() { 
System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h"); 
} 
} 
// Single Inheritance: Car inherits from Vehicle 
class Car extends Vehicle { 
int doors; 
public Car(String brand, int speed, int doors) { 
super(brand, speed); 
this.doors = doors; 
} 
public void showCarDetails() { 
showDetails(); 
System.out.println("Doors: " + doors); 
} 
} // Multilevel Inheritance: ElectricCar inherits from Car 
class ElectricCar extends Car { 
int batteryCapacity; 
public ElectricCar(String brand, int speed, int doors, int batteryCapacity) { 
super(brand, speed, doors); 
this.batteryCapacity = batteryCapacity; 
} 
public void showElectricCarDetails() { 
showCarDetails(); 
System.out.println("Battery Capacity: " + batteryCapacity + " kWh"); 
} 
} 
// Hierarchical Inheritance: Bike also inherits from Vehicle 
class Bike extends Vehicle { 
String type; 
public Bike(String brand, int speed, String type) { 
super(brand, speed); 
this.type = type; 
} 
public void showBikeDetails() { 
showDetails(); 
System.out.println("Type: " + type); 
} 
} 
// Main class to test the program 
public class InheritanceDemo { 
public static void main(String[] args) { 
System.out.println("--- Single Inheritance ---"); 
Car car = new Car("Toyota", 180, 4); 
car.showCarDetails(); 
System.out.println("\n--- Multilevel Inheritance ---"); 
ElectricCar eCar = new ElectricCar("Tesla", 200, 4, 100); 
eCar.showElectricCarDetails(); 
System.out.println("\n--- Hierarchical Inheritance ---"); 
Bike bike = new Bike("Yamaha", 120, "Sport"); 
bike.showBikeDetails(); } 
}