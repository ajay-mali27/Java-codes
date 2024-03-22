package polymorphism;

public class A {

	void m1(String name,int age,int Roll_No) {
		System.out.println("Enter Your name :"+name);
		System.out.println("Enter Your name :"+age );
		System.out.println("Enter Your name :"+Roll_No);
	}
	
	
	@Overload
	void m1(String name,int age,int Roll_No,int UID) {
		System.out.println("Enter Your name"+name);
		System.out.println("Enter Your name"+age );
		System.out.println("Enter Your name"+Roll_No);
		System.out.println("Enter Your UID :"+UID);
	}
	
	
	public static void main(String[] args) {
		A ss=new A();
		ss.m1("Ajay",27,99);
		System.out.println("**********************************");
		ss.m1("Ajay",27,99,61552);
	}
}
