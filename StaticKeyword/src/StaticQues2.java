class AAB{
	int x=10;
	static String y;
	void show() {
		System.out.println(x+y);
	}
}
public class StaticQues2 {
	  public static void main(String[] args) {
		  System.out.println(AAB.y);
			AAB a1=new AAB();
			AAB a2=new AAB();
			a1.x=40; a2.y="Yoyo";
			a1.y="abc";
			a1.show();
			a2.show();	 
}
}
