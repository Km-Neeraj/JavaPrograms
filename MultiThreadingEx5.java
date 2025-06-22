class RR{
	private int a;
	void show(int x) {
		System.out.println("Hello R");
		a=x;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("OK R");
		System.out.println(a);
	}
}
class AAAA extends Thread {
	public void run() {
		RR r=new RR();
		r.show(10);
	}
}
class BBBB extends Thread {
	public void run() {
		RR r=new RR();
		r.show(20);
	}
}
public class MultiThreadingEx5 {
	public static void main(String[] args) {
		new AAAA().start();
		new BBBB().start();
	}
}
