
public class ExceptionHandlingEx1 {
	
	public static void main(String[] args) {
		System.out.println("Hello User");
		
		int a=12,b=0,c=0;
		
		try {
			c=a/b;
			System.out.println("Division : "+c);
		}
		catch(NullPointerException e) {
			System.out.println("Number cann't be divided by zero");
		}
		
		
		System.out.println("Byee User");
	}
}
