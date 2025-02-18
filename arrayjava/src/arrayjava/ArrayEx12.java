package arrayjava;

import java.util.Arrays;
  import java.util.Scanner;
  
public class ArrayEx12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Array Size:");
		int m=sc.nextInt();
		
		int [][]a=new int[m][]; 
		
		for(int x=0;x<a.length;x++) {
			System.out.println("Please Enter the No of Elements for Array");
			int n=sc.nextInt();
			a[x]=new int[n];
		}
		
		for(int x=0;x<a.length;x++) {
			System.out.println("Enter values for Array ");
			for(int y=0;y<a[x].length;y++) {
				a[x][y]=sc.nextInt();
			}
		}
		
		System.out.println("Entered Array Values Are:");
		for(int y[]:a) {
			System.out.println("Values for Array ");
			for(int x:y) {
				System.out.print(x+" ");
			}
			System.out.println();
		}
		sc.close();
  }
}
