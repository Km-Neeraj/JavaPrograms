
public class ScannerEx {
	public static void main(String[] args) {
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		
		
		System.out.println("Enter a Integer value:");
		int a=scanner.nextInt();
		System.out.println(a);
		
		System.out.println("Enter a Floating Value:");
		double d=scanner.nextDouble();
		System.out.println(d);
		
		System.out.println("Enter a String:");
		String s=scanner.next();
		System.out.println(s);
		
		scanner.close();
	}
}
