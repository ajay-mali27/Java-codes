package thisKeyword;

public class A {
void m1() {
//	1
	System.out.println("Method m1 ");
	
}

int sum=69;
//5 Calling of Variable with This Keyword
 
void m3() {
	int sum=50;
	System.out.println(sum);
	System.out.println(this.sum);
}



void m2() {
	A ss = new A();
	ss.m1();
	this.m3();
//	2
}
public static void main(String[] args) {
//	3
	A ss=new A();
	ss.m2();
	 
}
}


//4 Call m1 From m1 ?
//-> we can do it with the help of Object Creation

/*
 * eg void m2() { A ss=new A(); ss.m1();
 * 
 * }
 * 
 */


