class A{
	int x=10;
	
	static A getObject() {
		return new A();
	}
	
	private A(){
		System.out.println("Hello A");
	}
}


public class PrivateContrcutorEx {

	public static void main(String[] args) {
		A a=A.getObject();
		A b=A.getObject();
		A c=A.getObject();
		System.out.println(a.x);
		System.out.println(b.x);
		System.out.println(c.x);
		a.x=15;
		System.out.println(a.x);
		System.out.println(b.x);
		System.out.println(c.x);
	}

}
