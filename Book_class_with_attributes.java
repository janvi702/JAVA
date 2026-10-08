class Book { 
private String title; 
private String author; 
private double price; 
// Parameterized Constructor 
Book(String t, String a, double p) { 
title = t; 
author = a; 
price = p; 
} 
// Method to display book details 
void display() { 
System.out.println("Book Details:"); 
System.out.println("Title : " + title); 
System.out.println("Author : " + author); 
System.out.println("Price : ₹" + price); 
System.out.println(" -------------------------- "); 
} 
public static void main(String[] args) { 
// Creating two book objects 
Book b1 = new Book("Let Us Java", " Yashavant Kanetkar ", 399.00); 
Book b2 = new Book("The Alchemist", "Paulo Coelho", 299.50); // Displaying book details 
b1.display(); 
b2.display(); 
} 
}