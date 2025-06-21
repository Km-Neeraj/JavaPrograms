
public class SwitchEx1 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter the day number in between 1 to 7");
		int dayNo=sc.nextInt();
		
		switch(dayNo) {
			default:
				System.out.println("Invalid Day");
				break;
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			
		}
		
		System.out.println("Byee");
	}

}
