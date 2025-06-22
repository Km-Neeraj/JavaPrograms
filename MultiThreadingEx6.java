class R{
	private int a;
	synchronized void show(int x) {
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
class M extends Thread {
	R r;
	M(R r){
		this.r=r;
	}
	public void run() {
		r.show(10);
	}
}
class N extends Thread {
	R r;
	N(R a){
		r=a;
	}
	public void run() {
		r.show(20);
	}
}
public class MultiThreadingEx6 {
	public static void main(String[] args) {
		R r=new R();
		new M(r).start();
		new N(r).start();
	}
}
