
public class VarArgsEx3 {
	public static void main(String[] args) {
		show(6);
		//priority: Same-type->UpCasting->Boxing->Object->Var-Args
	}
	static void show(byte a) {
		System.out.println("byte");
	}
	static void show(int a) {
		System.out.println("int");
	}
	static void show(double a) {
		System.out.println("double");
	}
	static void show(Integer a) {
		System.out.println("Integer");
	}
	static void show(Object a) {
		System.out.println("Integer");
	}
	static void show(int...a) {
		System.out.println("int var-args");
	}
//	static void show(int[]a) { //error
//		System.out.println("int array");
//	}
}
