
class Employee{
	String name;
	int salary;
	String cname;
}
public class ClassObjectEx1 {

	public static void main(String[] args) {
		Employee a=new Employee();
		Employee b=new Employee();
		Employee c=new Employee();
		Employee d=new Employee();
		
		System.out.println(a);
		System.out.println(a.name+" "+a.salary+" "+a.cname);
		System.out.println(b.name+" "+b.salary+" "+b.cname);
		System.out.println(c.name+" "+c.salary+" "+c.cname);
		System.out.println(d.name+" "+d.salary+" "+d.cname);
		
		a.name="John";
		a.salary=64412;
		a.cname="ABC";
		
		b.name="Murali";
		b.salary=12000;
		b.cname="ABC";
		
		c.name="Chaman";
		c.salary=98765;
		c.cname="PQR";
		
		d.name="Shyamlal";
		d.salary=12;
		d.cname="PQR";
		
		System.out.println(a.name+" "+a.salary+" "+a.cname);
		System.out.println(b.name+" "+b.salary+" "+b.cname);
		System.out.println(c.name+" "+c.salary+" "+c.cname);
		System.out.println(d.name+" "+d.salary+" "+d.cname);
	
		int total=a.salary+b.salary+c.salary+d.salary;
		System.out.println("Total salary :"+total);
	}	
}
