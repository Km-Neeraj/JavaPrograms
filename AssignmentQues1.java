
public class AssignmentQues1 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
//		boolean f=true;
		int choice;
		do {
			System.out.println("Enter 1 to Add");
			System.out.println("Enter 2 to Subtract");
			System.out.println("Enter 3 to Multiply");
			System.out.println("Enter 4 to Division");
			System.out.println("Enter 5 to Exit");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter two number to add");
				int n1=sc.nextInt();
				int n2=sc.nextInt();
				System.out.println("Sum of "+n1+" and "+n2+" = "+(n1+n2));
				break;
			case 2:
				System.out.println("Enter two number to Subtract");
				int s1=sc.nextInt();
				int s2=sc.nextInt();
				System.out.println("Sum of "+s1+" and "+s2+" = "+(s1-s2));
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			default:
				System.out.println("Invalid Choice!!");
			}
		}while(choice!=5);
		
		System.out.println("Thanks for using our App!!");
	}

}
