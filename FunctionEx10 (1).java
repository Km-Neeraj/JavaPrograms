//Recursion
public class FunctionEx10 {
	static void print(int a) {
		if(a<=2) {
			System.out.println("Hello "+a);
			a++;
			print(a);
		}
	}
	public static void main(String[] args) {
		System.out.println("Hello Main");
		print(1);
		System.out.println("Bye Main");
	}
}
