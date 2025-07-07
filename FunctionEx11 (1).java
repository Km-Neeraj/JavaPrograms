//Recursion
public class FunctionEx11 {
	static void print(int a) {
		if(a<=2) {
			System.out.println("Hello Print"+a);
			a++;
			print(a);
			System.out.println(a);
		}
		System.out.println("Bye Print");
	}
	public static void main(String[] args) {
		System.out.println("Hello Main");
		print(1);
		System.out.println("Bye Main");
	}
}
