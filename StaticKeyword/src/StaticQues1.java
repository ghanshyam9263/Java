class b{
	int x=10;
	static String y="Ram";
	void show() {
		System.out.println(x+y);
	}
}
public class StaticQues1 {
	  public static void main(String[] args) {
		  b a1=new b();
			a1.x=20; a1.y="Xyz";
			b a2=new b();
			a2.x=40; a2.y="Yoyo";
			a1.show();
			a2.show();
	}
}
