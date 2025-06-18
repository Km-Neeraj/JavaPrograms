
public class IfElseIfQues {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		
		if(a%5==0&&a%3==0) {
			System.out.println("5 and 3");
		}
		else if(a%3==0) {
			System.out.println("3");
		}
		else if(a%5==0) {
			System.out.println("5");
		}
		else {
			System.out.println("Kise se bhi nahi");
		}
		
		System.out.println("Thanks for using APP");
	}

}
