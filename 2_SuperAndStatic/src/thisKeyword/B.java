package thisKeyword;

public class B {
//Constructor Calling

	
	B(){
		this(20);
	}
	
	B(int a){
		System.out.println("The Value of a is :"+a);
	}
	
	public static void main(String[] args) {
		B ss=new B();
	}
}


