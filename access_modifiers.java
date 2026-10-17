// BankAccount.java (Encapsulation using access modifiers) 
class BankAccount { 
private String accountHolderName; // Private: Accessible only in this class 
private double balance; // Private: Keeps sensitive data secure 
public BankAccount(String accountHolderName, double initialBalance) { 
this.accountHolderName = accountHolderName; 
this.balance = initialBalance; 
} 
public void deposit(double amount) { // Public: Accessible from anywhere 
if (amount > 0) { 
balance += amount; 
System.out.println("Deposit successful. New balance: " + balance); 
} 
} 
public double getBalance() { // Public getter to access private balance 
return balance; 
} } 
// Main class to test access modifiers 
public class AccessModifierDemo { 
public static void main(String[] args) { BankAccount account = new BankAccount("Alice", 5000); 
// account.balance = 10000; // Error: balance is private 
// System.out.println(account.accountHolderName); // Error: Private field 
// Using public methods to access private fields 
account.deposit(2000); 
System.out.println("Current Balance: " + account.getBalance()); 
} }