package arrayjava;
import java.util.Arrays;
 import java.util.Arrays;
public class ArrayEx5 {
public static void main(String[] args) {
		
		int a[]={8,3,10,5,7,2,4,5,1,5};
		
		//add all elements 
		int s=0;
//		for(int x=0;x<a.length;x++) {
//			s += a[x];
//		}
		for(int x:a) {
			s += x;
		}
		System.out.println("Sum: "+s);
		System.err.println();
		
		//access array elements in reverse
		for(int x=a.length-1;x>=0;x--) {
			System.out.println(a[x]);
		}
		System.out.println();
		//access array elements by skipping one
		for(int x=0;x<a.length;x+=2) {
			System.out.println(a[x]);
		}
    }
}
