class RRR{
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
class AAAAA extends Thread {
	RRR r;
	AAAAA(RRR r){
		this.r=r;
	}
	public void run() {
		
		r.show(10);
	}
}
class BBBBB extends Thread {
	RRR r;
	BBBBB(RRR r){
		this.r=r;
	}
	public void run() {
		r.show(20);
	}
}
public class MultiThreadingEx51 {
	public static void main(String[] args) {
		RRR r=new RRR();
		new AAAAA(r).start();
		new BBBBB(r).start();
	}
}
