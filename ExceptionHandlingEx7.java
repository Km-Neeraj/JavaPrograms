
public class ExceptionHandlingEx7 {

	public static void main(String[] args) {
		System.out.println("Hello");
		int a=12,b=2,r=0;
		try {
			r=a/b;
			System.out.println("Division: "+r);
			System.out.println("Hi");
			int x[]= {5,2,8,6,9,98};
			System.out.println(x[r]);
		}catch (Exception ex) {
//			System.out.println(ex.getMessage());
			
			ex.printStackTrace();
		}
		System.out.println("Bye");
	}

}
