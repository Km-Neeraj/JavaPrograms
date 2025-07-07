//Recursion
public class FunctionEx8 {
	static void m() {
		System.out.println("Incapp");
		m();
	}
	public static void main(String[] args) {
		System.out.println("Hello Main");
		m();
		System.out.println("Hi Main");
		m();
		System.out.println("Bye Main");
	}
}
