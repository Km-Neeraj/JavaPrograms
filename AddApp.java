
public class AddApp {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter 1st number:");
		int n1=sc.nextInt();
		System.out.println("Enter 2nd number:");
		int n2=sc.nextInt();
		
//		int sum=n1+n2;
		
		System.out.println("Sum of "+n1+" and "+n2+" is "+(n1+n2));
		
		sc.close();
	}
}
