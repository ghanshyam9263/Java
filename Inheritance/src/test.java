class AA {
	int x=10;
	static int h=10;
	private int z=30;
	void showZ() {
		System.out.println(z);
	}
	void m1() {
		System.out.println("Hello A");
	}
}
class BB extends AA{
	int y=20;
	void m2() {
		
		
	}
}
public class test {
   public static void main(String[] args) {
	   AA a=new AA();
		a.x=15;
		a.h=15;
		System.err.println(a.x);
		BB b=new BB();
		System.out.println(b.x);
	
}
}
