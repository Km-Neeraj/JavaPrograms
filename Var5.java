//Local Variable Type Inference- var
//Introduced in JAVA 10

class X{
	int a=90;
	void m1(){
		System.out.println("Hello X");
	}
	void m() {
		System.out.println("Hi X");
	}
}
class Y extends X{
	int b=60;
	void m2(){
		System.out.println("Hello Y");
	}
	void m() {
		System.out.println("Hi Y");
	}
}
public class Var5 {

	public static void main(String[] args) {

		var a=new Y();
		a.m1();
		a.m2();
		a.m();
		System.out.println(a.a);
		System.out.println(a.b);
		
		
		X x=new Y();
		x.m();
		x.m1();
		System.out.println(x.a);
		//x.m2();//error
		//System.out.println(x.b);//error
		
		
	}

}
