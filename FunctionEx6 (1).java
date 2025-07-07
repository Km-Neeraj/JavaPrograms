
public class FunctionEx6 {
	
	static String findEvenOdd(int a) {
		if(a%2==0) {
			return "Even";
		}else {
			return "Odd";
		}
	}
	public static void main(String[] args) {
		String res=findEvenOdd(12);
		System.out.println(res);
		System.out.println(findEvenOdd(13));
	}
}
