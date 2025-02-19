@FunctionalInterface
interface Add{
	int sum(int x,int y);
}

public class LambdaEx3 {

	public static void main(String[] args) {
//		
		
		Add a=(m,n)->{
			int r=m+n;
			return r;
		};
		
		int result=a.sum(45, 30);
		System.out.println("Sum: "+result);
	}
}
