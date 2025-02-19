
public class ScannerSimpleInterestAssignment {
    public static void main(String[] args) {
    	 java.util.Scanner PRT=new java.util.Scanner(System.in);
    	 System.out.println("Enter a principle");
            int a = PRT.nextInt();
         System.out.println("Enter a Rate in percent");  
            int b = PRT.nextInt();
         System.out.println("Enter Time in years");
            int c = PRT.nextInt();
         System.out.println("Simple Interest :"+(a*b*c)/100);   
    	
    	PRT.close();
	}
}
