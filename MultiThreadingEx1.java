class A implements Runnable{
	public void run() {
		System.out.println("A1");
		System.out.println("A2");
		System.out.println("A3");
//		System.out.println(7/0);
		System.out.println("A4");
		System.out.println("A5");
	}
}

class B implements Runnable{
	public void run() {
		System.out.println("B1");
		System.out.println("B2");
		System.out.println("B3");
		System.out.println("B4");
		System.out.println("B5");
	}
}

class C implements Runnable{
	public void run() {
		System.out.println("C1");
		System.out.println("C2");
		System.out.println("C3");
		System.out.println("C4");
		System.out.println("C5");
	}
}
public class MultiThreadingEx1 {
	public static void main(String[] args) {
		System.out.println("Hello Main");
		A a=new A();
		Thread t1=new Thread(a);
		t1.start();
		System.out.println("Hii Main");
		B b=new B();
		Thread t2=new Thread(b);
		t2.start();
		System.out.println("Heyy Main");
		C c=new C();
		Thread t3=new Thread(c);
		t3.start();
		System.out.println("Byee Main");
	}
}
