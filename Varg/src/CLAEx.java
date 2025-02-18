
public class CLAEx {
      // static void main(String[]s) {
   	 static public void main(String ... s){ //allowed
		  System.out.println("hello");
		  
		  for(String x:s) {
			  System.out.println(x);
		  }
		  System.out.println("bye");
	}
}
