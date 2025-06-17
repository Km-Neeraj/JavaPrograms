
public class IfElseEx2 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter your age::");
		int age=sc.nextInt();
		
		if(age>=13 && age<=18) {
			System.out.println("You are Teenager");
		}
		else {
			System.out.println("You are not Teenager");
		}
		
		System.out.println("Bye User");
		
		sc.close();
	}

}
