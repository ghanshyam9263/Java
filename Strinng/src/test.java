import java.util.StringTokenizer;

public class test {
	public static void main(String[] args) {
		String s="I love my INDIA ghanshyam ";
//		StringTokenizer st = new StringTokenizer(s," ");
//		StringTokenizer st = new StringTokenizer(s,"m");
//		StringTokenizer st = new StringTokenizer(s,"");
//    	StringTokenizer st = new StringTokenizer(s,"k");
		StringTokenizer st = new StringTokenizer(s,"");
    
		int c=st.countTokens();
		System.out.println(c);
}
}
