package interfaceProgram;

public class X implements A,B {
	
	@Override
	public  void m1() {
		System.out.println("Hello World");
		
	}
	
	public  void m1(int a,int b) {
		System.out.println("The addition of two numbers is :"+a+b);
		
	}
	
	public static void main(String[] args) {
		X ss=new X();
		ss.m1();
		ss.m1(2,5);
	}
}