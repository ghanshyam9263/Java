@FunctionalInterface
interface Addition{
	void add();
}
public class LambdaEx1 {
	public static void main(String[] args) {
		//Method Overriding using Anonymous Class
//		Addition a=new Addition() {
//			public void add() {
//				int x=10,y=20,r=x+y;
//				System.out.println("Sum: "+r);
//			}
//		};
		
		//Method Overriding using Lambda Expression
		Addition a=()->{
			int x=10,y=20,r=x+y;
			System.out.println("Sum: "+r);
		};
		
		a.add();
		a.add();
		a.add();
		
		Addition a2=()->{
			System.out.println("dfghkldfjgklhdgfj hgfklhj k");
		};
		
		a2.add();
	}
}
