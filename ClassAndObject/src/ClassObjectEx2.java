class student{ 
	String name;
	int age;
	String fname;
	String sname;
	int fee;
}
public class ClassObjectEx2 {
   public static void main(String[] args) {
		student a=new student();
		student b=new student();
		student c=new student();
		student d=new student();
		student e=new student();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	
//		System.out.println(a.sname+" "+a.age+" "+a.name+" "+a.fee+" "+a.fname);
//		System.out.println(b.sname+" "+b.age+" "+b.name+" "+b.fee+" "+b.fname);
//		System.out.println(c.sname+" "+c.age+" "+c.name+" "+c.fee+" "+c.fname);
//		System.out.println(d.sname+" "+d.age+" "+d.name+" "+d.fee+" "+d.fname);
//		System.out.println(e.sname+" "+e.age+" "+e.name+" "+e.fee+" "+e.fname);
	
		a.name="devansh";
		a.age=22;
		a.sname="oxford";
		a.fname="amit sharma";
		a.fee=8000;
		a.name="Yoyo Gupta";
		b.name="ayush";
		b.age=21;
		b.sname="vertex";
		b.fname="sham sharma";
		b.fee=8000;
		b.name="Yoyo Gupta";
		c.name="dev";
		c.age=25;
		c.sname="samsara";
		c.fname="shiv sharma";
		c.fee=8000;
		c.name="maksad Gupta";b.name="ayush";
		d.age=18;
		d.sname="DPS";
		d.fname="Yash ";
		d.fee=8000;
		d.name="Gupta";
		e.name="Kammo G";
		e.age=19;
		e.sname="oxford";
		e.fname=" pramod";
		e.fee=8000;
		e.name="zuari Gupta";
		System.out.println(a.sname+" "+a.age+" "+a.name+" "+a.fee+" "+a.fname);
		System.out.println(b.sname+" "+b.age+" "+b.name+" "+b.fee+" "+b.fname);
		System.out.println(c.sname+" "+c.age+" "+c.name+" "+c.fee+" "+c.fname);
		System.out.println(d.sname+" "+d.age+" "+d.name+" "+d.fee+" "+d.fname);
		System.out.println(e.sname+" "+e.age+" "+e.name+" "+e.fee+" "+e.fname);
	
	 
}
}
