class MyThread extends Thread{

	@Override
	public void run() {
		System.out.println("Hello");
		System.out.println("Hi");
		System.out.println("Ok");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("Interruption hua re.");
		}
		System.out.println("Incapp");
		System.out.println("Bye");
	}
	
}
public class MultiThreadingEx8 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello Main");
		MyThread t=new MyThread();
		t.start();
		Thread.sleep(2000);
		t.interrupt();
		System.out.println("Bye Main");
	}
}
