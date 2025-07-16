;public class StringEx3 {
	public static void main(String[] args) {
		String s1="Incapp";
		String s2=new String("Incapp");
		String s3="Incapp";
		String s4=new String("Incapp");
		String s5="Incapp";
		String s6=new String("Incapp");
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s4);
		System.out.println(s3==s5);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s4));
		System.out.println(s3.equals(s6));
		
		s1=null;
		s2=null;
	}
}
