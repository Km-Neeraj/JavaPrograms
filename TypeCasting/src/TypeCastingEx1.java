
public class TypeCastingEx1 {

	public static void main(String[] args) {
		
		byte a=100,b=100;
		//byte c=a+b;//eroor
		int c=a+b;
		System.out.println(c);
		
		byte a1=127;
		a1=(byte)(a1+1);
		System.out.println(a1);
		
		
		

	}

}
