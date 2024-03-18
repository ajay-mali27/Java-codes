package thisKeyword;

public class D extends C {

	void m2( ) {
		this.m1();
	}
	
	public static void main(String[] args) {
		D ss=new D();
		ss.m2();
		
	}
}
