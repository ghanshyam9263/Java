class Employee12{
	String name;
	int salary;
	static String cname="ABC";
	void show(){
		System.out.println(name+" "+salary+" "+cname);
	}
	public void input(String n,int s) {
		name=n;
		salary=s;
	}
}
public class StaticVerableEx1 {
	  public static void main(String[] args) {
		//System.out.println(cname);//error
		System.out.println(Employee12.cname);
		
		Employee12 a=new Employee12();
		Employee12 b=new Employee12();
		Employee12 c=new Employee12();
		Employee12 d=new Employee12();
		
		a.show();
		b.show();
		c.show();
		d.show();
		
		a.input("Cheetah Khan",256000);
		b.input("Yoyo Gupta",125000);
		c.input("Gogo Singh",98000);
		d.input("Teja Seth",780000);
		

		a.cname="XYZ";
		
		a.show();
		b.show();
		c.show();
		d.show();
	}
}
