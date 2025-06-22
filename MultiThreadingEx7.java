class Bank{
	private int amount;
	synchronized int withdraw() {
		if(amount==0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return amount;
	}
	synchronized void submit(int a) {
		amount=a;
		notify();
	}
}
class T1 extends Thread {
	Bank b;
	T1(Bank b){
		this.b=b;
	}
	public void run() {
		System.out.println("Amount: "+b.withdraw());
	}
}
class T2 extends Thread {
	Bank b;
	T2(Bank b){
		this.b=b;
	}
	public void run() {
		b.submit(100000);
		System.out.println("Amount Submitted");
	}
}
public class MultiThreadingEx7 {
	public static void main(String[] args) {
		Bank b=new Bank();
		new T1(b).start();
		new T2(b).start();
	}
}
