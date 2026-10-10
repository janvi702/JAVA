class DefaultValues { 
// Instance variables 
int a; 
double b; 
boolean c; 
char d; 
String e; 
// Static variables 
static int sa; 
static double sb; 
static boolean sc; 
static char sd; 
static String se; 
// Method to display default values of instance variables 
void displayInstanceVal() { 
System.out.println("Instance Variables:"); 
System.out.println("int: " + a); 
System.out.println("double: " + b); 
System.out.println("boolean: " + c); 
System.out.println("char: " + d); 
System.out.println("String: " + e); 
} // Method to display default values of static variables 
static void displayStaticVal() { 
System.out.println("Static Variables:"); 
System.out.println("int: " + sa); 
System.out.println("double: " + sb); 
System.out.println("boolean: " + sc); 
System.out.println("char: " + sd); 
System.out.println("String: " + se); 
} 
public static void main(String[] args) { 
DefaultValues obj = new DefaultValues(); 
// Display default values of instance variables 
obj.displayInstanceVal(); 
// Display default values of static variables 
displayStaticVal(); 
} 
}