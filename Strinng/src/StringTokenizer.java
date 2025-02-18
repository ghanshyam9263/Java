

public class StringTokenizer {
	public static void main(String[] args) {
	String s="I lomve my INDyIA";
		
		//since 1.4
		
//		String s1[]=s.split(" ");
//		String s1[]=s.split("my");
//		String s1[]=s.split("I");
		String s1[]=s.split("");
		for(String x:s1) {
			System.out.println(x);
		}	
		
}
}
