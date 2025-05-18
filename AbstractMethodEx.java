abstract class P{
	abstract void m();
	abstract void m2();
}

abstract class Q extends P{//Not mandatory to override abstract methods here
	void m() {
		System.out.println("Hello Q");
	}
}
class R extends Q{
	void m2() {
		
	}
}

public class AbstractMethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
