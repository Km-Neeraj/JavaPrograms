
public class WhileLoopEx2 {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n=sc.nextInt();//123 12 1  0
		
		while(n!=0) {
			System.out.print(n%10);
			n=n/10;
		}
		
		sc.close();
	}
}
