
public class EvenOrOdd {
	
	static void checkEven(int a) {
		if(a%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}

	public static void main(String[] args) {
		
		checkEven(12);
		checkEven(15);
		checkEven(13);
	}

}
