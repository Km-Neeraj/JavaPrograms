
public class TypeCasting5 {
	public static void main(String[] args) {
		byte a=10;
		//a=a+1;
		a=(byte)(a+1);
		System.out.println(a);
		
		byte b=127;
		b=(byte)(b+1);
		System.out.println(b);
		
		byte c=127;
		c=(byte)(c+5);
		System.out.println(c);
		
		short z=32767;
		z=(short)(z+2);
		System.out.println(z);
	}
}
