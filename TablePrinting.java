
public class TablePrinting {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		
		for(int i=1;i<=100;i++) {
			System.out.println(n*i);
		}
		
		sc.close();
	}

}
