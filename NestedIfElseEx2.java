
public class NestedIfElseEx2 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter any three number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a==b&&a==c) {
			System.out.println("All are equal");
		}
		else {
			if(a>b) {
				if(a>c) {
					System.out.println(a+" is greatest");
				}
				else {
					System.out.println(c+" is greatest");
				}
			}
			else {
				if(b>c) {
					System.out.println(b+" is greatest");
				}
				else {
					System.out.println(c+" is greatest");
				}
			}
		}

		sc.close();
	}

}
