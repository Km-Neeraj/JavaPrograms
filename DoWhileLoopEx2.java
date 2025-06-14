
public class DoWhileLoopEx2 {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String s;
		do {
			System.out.println("Enter 1st number:");
			int n1=sc.nextInt();
			System.out.println("Enter 2nd number:");
			int n2=sc.nextInt();
			int sum=n1+n2;
			System.out.println("Sum : "+sum);
			System.out.println("Enter yes to continue");
			s=sc.next();
		}while(s.equalsIgnoreCase("yes"));
		
		System.out.println("Bye user");
		sc.close();
	}
}
