package users;

public class User {
    protected String name;
    protected String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}


package customers;

import users.User;

public class Customer extends User {
    protected String address;

    public Customer(String name, String email, String address) {
        super(name, email);
        this.address = address;
    }

    public void showCustomerDetails() {
        showDetails();
        System.out.println("Address: " + address);
    }
}


package primecustomers;

import customers.Customer;

public class PrimeCustomer extends Customer {
    private String membershipType;

    public PrimeCustomer(String name, String email, String address, String membershipType) {
        super(name, email, address);
        this.membershipType = membershipType;
    }

    public void showPrimeCustomerDetails() {
        showCustomerDetails();
        System.out.println("Membership Type: " + membershipType);
    }
}




import primecustomers.PrimeCustomer;

public class MultilevelInheritanceTest {
    public static void main(String[] args) {
        PrimeCustomer primeUser = new PrimeCustomer("Alice", "alice@example.com", "123 Street, NY", "Gold");
        primeUser.showPrimeCustomerDetails();
    }
}
