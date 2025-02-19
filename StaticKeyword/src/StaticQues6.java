class Qw{
	static int x;
	String y="KK";
	void show() {
		System.out.println(x+y);
		x++;
	}
}
public class StaticQues6 {
	  public static void main(String[] args) {
			Qw q1=new Qw();
			Qw q2=new Qw();
			q1.show();
			++Qw.x;
			q2.show();
			q1.show(); 
}
}
