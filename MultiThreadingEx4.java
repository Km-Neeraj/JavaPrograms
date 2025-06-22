class Resource{
	void show() {
		System.out.println("Hello R");
		System.out.println("Hi R");
		System.out.println("OK R");
	}
}
class K extends Thread {
	Resource r;
	K(Resource r){
		this.r=r;
	}
	public void run() {
		
		r.show();
	}
}
class L extends Thread {
	Resource r;
	L(Resource r){
		this.r=r;
	}
	public void run() {
		
		r.show();
	}
}
public class MultiThreadingEx4 {
	public static void main(String[] args) {
		Resource r=new Resource();
		new K(r).start();
		new L(r).start();
	}
}
