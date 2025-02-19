
public class ScannerEx {
    public static void main(String[] args) {
java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter an Integer data:");
		int a=sc.nextInt();
		System.out.println("a: "+a);

		System.out.println("Enter a FloatingPoint data:");
		double b=sc.nextDouble();
		System.out.println("b: "+b);
		
		System.out.println("Enter String data:");
		String c=sc.next();
		System.out.println("c: "+c);
		
		sc.close();	
	}
}
