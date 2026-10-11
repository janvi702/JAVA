//Primitive to Wrapper (int to Integer) boxing 
class WrapperExample1{ 
public static void main(String args[]){ 
int a=20; 
//converting int to Integer 
Integer i=Integer.valueOf(a); 
//autoboxing compiler will convert Integer.valueOf(a) internally 
Integer j=a; 
System.out.println(a+" "+i+" "+j); 
} 
} 
//Wrapper to Primitive (Integer to int) unboxing 
class WrapperExample2{ 
public static void main(String args[]){ 
Integer a=new Integer(3); 
//converting Integer to int 
int i=a.intValue(); 
//unboxing, compiler will convert a.intValue() internally 
int j=a; 
System.out.println(a+" "+i+" "+j);