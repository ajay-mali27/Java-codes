package superKeyword;

public class B extends A {
	
	
//	Constructor OF B class
	B(){
		System.out.println("This is a Constructor of B class");
	}
	
	
	@Override
	void m1() {
		System.out.println("This is a Child class");
	}

	void m2() {
		this.m1();
		
//		We have to Call the m1 Method of A class.
		
//		Method 1 - Object Creation
		
//		A ss=new A();
//		ss.m1();
		
//		Method 1 - By Super Class
		
		super.m1();
	}
	
	
	
	public static void main(String[] args) {
		B ss=new B();
		ss.m2();
	}
}
