
public class PrintingEx2 {

	public static void main(String[] args) {
		int n=15;
		double d=15.373;
		char c='h';
		String s="Incapp";
		boolean b=true;
		
		System.out.printf("%b\n",b);
		System.out.printf("%d%n",n);
		System.out.format("%f\n",d);
		System.out.printf("%c\n",c);
		System.out.printf("%s\n",s);
		
		System.out.format("%b\n%c\n%s\n%f\n%d",b,c,s,d,n);
		System.out.printf("%b\n%c\n%s\n%f\n%d",b,c,s,d,n);
	}

}
