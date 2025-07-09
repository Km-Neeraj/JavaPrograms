
public class ForLoopEx7 {
	public static void main(String[] args) {

		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n=sc.nextInt();//5
		
		int sum=0;//1 3 6  10 15
		
		for(int i=1;i<=n;i++) {
			System.out.print(i);
			
			if(i<n) {
				System.out.print("");
			}
			sum+=i;
		}
		
		System.out.println("="+sum);
	}
}
