class A1{
	int x=10;
	static{
		System.out.println("Hi A");
	}
	void m1() {
		System.out.println("Hello A");
	}
}
class B1 extends A1{
	int y=20;
	static{
		System.out.println("Hi B");
	}
	void m2() {
		System.out.println("Hello B");
	}
}
public class InheritanceExStaticBlock {
   public static void main(String[] args) {
	   A1 a=new A1();
		B1 b1=new B1();
		B1 b2=new B1();
}
}
