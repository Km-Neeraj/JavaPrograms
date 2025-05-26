
public class ParsingEx {

	public static void main(String[] args) {
		//String to Primitive Parsing
		
		String s1="12";
		String s2="14";
//		int a=s;//error
//		int a=(int)s;
		
		System.out.println(s1+s2);
		
//		int a=Integer.parseInt("12a");//Number Format Exception
		int a=Integer.parseInt("12");
		System.out.println(a);
		
		double d=Double.parseDouble("12.6");
		System.out.println(d);
	}

}
