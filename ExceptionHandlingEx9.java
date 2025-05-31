class X{
	void m() {
		System.out.println("Hello X");
	}
}
public class ExceptionHandlingEx9 {

	public static void main(String[] args) {
		try {
//			X x =null;
//			x.m();
			
			String s=null;
			System.out.println(s.toUpperCase());
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}

}
