
public class StringEx5 {
	public static void main(String[] args) {
		
		String s1=new String("Incapp");//return the heap reference
		String s2="Incapp";
		
		System.out.println(s1==s2);
		
		s1=s1.intern();//intern method returns the pool object's reference
		
		System.out.println(s1==s2);
		
	}
}
