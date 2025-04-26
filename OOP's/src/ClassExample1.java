

class A
{
	int x;
	void m()
	{
		System.out.println("Hii A");
	}
}
public class ClassExample1 {
	
	public static void main(String[]abc)
	{
		A ob=new A();
		ob.x=10;
		ob.m();
		A ob1=new A();
		ob1.x=40;
		ob1.m();
		System.out.println(ob.x);
		System.out.println(ob1.x);
		
		
	}
	
	
	
	

}
