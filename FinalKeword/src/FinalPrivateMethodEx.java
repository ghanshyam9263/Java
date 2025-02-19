
class Xyy{
	final private void m1() {
		System.out.println("Hi X");
	}
	void m() {
		m1();
	}
}
class Yzz extends Xyy{
	void m1() {
		System.out.println("Hi Y");
	}
}
public class FinalPrivateMethodEx {
public static void main(String[] args) {
	Yzz y=new Yzz();
	y.m1();
	y.m();
}
}
