abstract class A{
	int x=12;
	A(){
		System.out.println("Hello A");
	}
}

class B extends A{
	B(){
		super();
	}
}
public class AbstractEx1 {

	public static void main(String[] args) {
//		A a=new A();//error
		
		B b=new B();
	}

}
