class X {
	public void m() {
		System.out.println("X1");
		System.out.println("X2");
		System.out.println("X3");
		System.out.println(7/0);
		System.out.println("X4");
		System.out.println("X5");
	}
}
class Y {
	public void m() {
		System.out.println("Y1");
		System.out.println("Y2");
		System.out.println("Y3");
		System.out.println("Y4");
		System.out.println("Y5");
	}
}
class Z {
	public void m() {
		System.out.println("Z1");
		System.out.println("Z2");
		System.out.println("Z3");
		System.out.println("Z4");
		System.out.println("Z5");
	}
}
public class MultiThreadingEx0 {
	public static void main(String[] args) {
		System.out.println("Hello Main");
		X x=new X();
		x.m();
		System.out.println("Hi Main");
		Y y=new Y();
		y.m();
		System.out.println("Ok Main");
		Z z=new Z();
		z.m();
		System.out.println("Bye Main");
	}
}
