class X {  
	int a=10;
	void print() {
		System.out.println("Hello X");
	}
}
class Y extends X{
	int b=20;
	int a=78;
	void m() {
		int c=30;
		int a=85;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		System.out.println(b);
		System.out.println(c);
		print();
		super.print();
	}
	void print() {
		System.out.println("Hello Y");
	}
}
public class ThisSuperAsMemberEx {
   public static void main(String[] args) {
	   Y y=new Y();
		System.out.println(y.a);
		y.print();
		y.m();
		
		X x=new X();
		System.out.println(x.a);//10
		x.print();//Hello X
}
}
