
public class Palindrome {
	
	
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter a number to check Palindrome:");
		int n=sc.nextInt();//121 12  1 0
		int t=n;//121
		int rev=0;//1->12->121
		
		while(n!=0) {
			int rem=n%10;//1
			rev=rev*10+rem;
			n/=10;
		}
		
		if(t==rev) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		
		sc.close();
	}
}
