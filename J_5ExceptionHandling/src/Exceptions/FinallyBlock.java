package Exceptions;

public class FinallyBlock {
public static void main(String[] args) {

	System.out.println(1);
	System.out.println(2);
	
	try {
		System.out.println(3/0);
	}
	catch(ArithmeticException ss) {
		System.out.println("Number Cannot Devide by zero");
	}
	
	finally{
		
		if(2==2) {
			System.out.println("Match");
		}
		else {
			System.out.println("Not match");
		}
	}
	
}
}
