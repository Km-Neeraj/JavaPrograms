
public class StringEx9 {
	public static void main(String[] args) {
		String s1="Incapp";//Immutable
		s1.concat("India");
		System.out.println(s1);
		
		
		//Mutable
//		StringBuilder s2=new StringBuilder("Hello");
		StringBuffer s2=new StringBuffer("Hello");
		s2.append("Hii");
		System.out.println(s2);
	}
}

		
//		CharSequence is an Interface
//		String -> subclass of CharSequence 
//		StringBuilder -> subclass of CharSequence 
//		StringBuffer -> subclass of CharSequence 
