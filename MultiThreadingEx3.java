
class AAA extends Thread {
	public void run() {
		System.out.println("A1");
		System.out.println("A2");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("A3");
		System.out.println("A4");
		System.out.println("A5");
	}
}
class BBB extends Thread {
	public void run() {
		System.out.println("B1");
		System.out.println("B2");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("B3");
		System.out.println("B4");
		System.out.println("B5");
	}
}
class CCC extends Thread {
	public void run() {
		System.out.println("C1");
		System.out.println("C2");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("C3");
		System.out.println("C4");
		System.out.println("C5");
	}
}
public class MultiThreadingEx3 {
	public static void main(String[] args) {
		System.out.println("Hello Main");
		AAA a=new AAA();
		a.start();
		System.out.println("Hi Main");
		BBB b=new BBB();
		b.start();
		System.out.println("Ok Main");
		CCC c=new CCC();
		c.start();
		System.out.println("Bye Main");
	}
}
