
public class NestedIfElseEx3 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Please enter your age");
		int age=sc.nextInt();//19
		
		if(age<=0 || age>120) {
			System.out.println("Invalid Age");
		}
		else {
			if(age>0&&age<=2) {
				System.out.println("Infant");
			}
			if(age>=3&&age<=6) {
				System.out.println("Kid");
			}
			if(age>=7&&age<=12) {
				System.out.println("Child");
			}
			if(age>=13&&age<=18) {
				System.out.println("Teenager");
			}
			if(age>=19&&age<=60) {
				System.out.println("Adult");
			}
			if(age>=61&&age<=90) {
				System.out.println("Old");
			}
			if(age>=91&&age<=120) {
				System.out.println("Very Old");
			}
		}
	}

}














