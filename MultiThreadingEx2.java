
class AA extends Thread {
	public void run() {
		System.out.println("A1");
		System.out.println("A2");
		System.out.println("A3");
		System.out.println("A4");
		System.out.println("A5");
	}
}
class BB extends Thread {
	public void run() {
		System.out.println("B1");
		System.out.println("B2");
		System.out.println("B3");
		System.out.println("B4");
		System.out.println("B5");
	}
}
class CC extends Thread {
	public void run() {
		System.out.println("C1");
		System.out.println("C2");
		System.out.println("C3");
		System.out.println("C4");
		System.out.println("C5");
	}
}
public class MultiThreadingEx2 {
	public static void main(String[] args) {
		System.out.println("Hello Main");
		AA a=new AA();
		a.start();
		System.out.println("Hi Main");
		BB b=new BB();
		b.start();
		System.out.println("Ok Main");
		CC c=new CC();
		c.start();
		System.out.println("Bye Main");
	}
}
