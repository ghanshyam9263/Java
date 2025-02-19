class AA1{
	final void m1() {
		System.out.println("Hello A");
	}
	final static void mm() {
		System.out.println("Ok A");
	}
	void m2() {
		System.out.println("Hi A");
	}
}
class BB extends AA1{
//	void m1() {  //error
//		System.out.println("fdh hfg jrjytjytkjyt");
//	}
//	static void mm() {  //error
//		System.out.println("Ok B");
//	}
	void m2() {
		System.out.println("sjkfh kghre gtglkh rkleh");
	}
}

public class FinalMethodEx {
public static void main(String[] args) {
	AA1 a=new AA1();
	a.m1();
	a.mm();
	a.m2();
	
	BB b=new BB();
	b.m1();
	b.mm();
	b.m2();
}
}
