//Introduced in Java 15 
sealed class A permits B,D{
	int x=10;
	void m() {
		System.out.println("Hello A");
	}
}
final class B extends A{
	int y=20;
}
//class C extends A{ //error
//	int z=40;
//}
final class D extends A{
	int k=70;
}
public class SealedEx1 {
	public static void main(String[] args) {
		B b=new B();
		System.out.println(b.y);
		System.out.println(b.x);
		b.m();
		D d=new D();
		System.out.println(d.k);
		System.out.println(d.x);
		d.m();
	}
}
