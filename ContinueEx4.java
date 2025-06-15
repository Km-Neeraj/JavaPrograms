
public class ContinueEx4 {
	public static void main(String[] args) {
		int a=1;
		while(a<=5) {
			System.out.println("Hello");
			a++;
			if(a==3){
				continue;
			}
//			a++;
			System.out.println("Incapp");
		}
		System.out.println("Bye");
	}
}
