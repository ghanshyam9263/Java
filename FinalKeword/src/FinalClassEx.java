final class ghanshyam{
	void m1() {
		System.out.println("Hello A");
	}
	void m2() {
		System.out.println("Hi A");
	}
}

//class B extends A{ //error
class Bh {
	void m1() {
		System.out.println("fdh hfg jrjytjytkjyt");
	}
	void m2() {
		System.out.println("sjkfh kghre gtglkh rkleh");
	}
}

public class FinalClassEx {
	public static void main(String[] args) {
		ghanshyam a=new ghanshyam();
		a.m1();
		a.m2();
		Bh b=new Bh();
		b.m1();
		b.m2();
	}
}
