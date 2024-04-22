package Exceptions;

public class A {
public static void main(String[] args) {
	System.out.println(1);
	System.out.println(2);
//	System.out.println(4/0);
	try {
		System.out.println(4/0);
	}
	
	catch(ArithmeticException aa) {
		System.out.println("Divide by zero is Not Allowed");
	}
	
	
	System.out.println(5);
}
}
