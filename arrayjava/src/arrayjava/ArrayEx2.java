package arrayjava;

public class ArrayEx2 {
       public static void main(String[] args) {
//	     int a[]= new int[4];//allowed
//	     
//	     a[0]=23;
//	     a[2]=24;
//	     a[3]=25;
//	     a[4]=26;
//	     
	     
//	     int a[];
//	     a=new int[] {3,4,5,6,7}; //allowed
//	  //   a=new int[4] {3,4,5,6,7}; //error
//	//     a= {3,4,5,6,7}; //error
//	     
	 //    int a[]=new int[]{8,3,10,5};//allowed
			int a[]={8,3,10,5};//now, new int[] is skip able
			for(int x:a)
				System.out.println(x); 
	     
	}
}
