
public class StringEx1 {

	public static void main(String[] args) {
		char c[]= {'I','n','c','a','p','p'};
		System.out.println(c);
//		System.out.println(c.toUpperCase());
		System.out.println(c.length);
		System.out.println(c[2]);
		
		String s1=new String("Incapp");
		System.out.println(s1);
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.length());
//		System.out.println(s1[2]);//error
		System.out.println(s1.charAt(2));
	}

}
