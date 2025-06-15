
public class ContinueEx5 {
	public static void main(String[] args) {
		int a=1;
		do {
			System.out.println("Hello");
			a++;
			if(a==3){
				continue;
			}
			System.out.println("Incapp");
		}while(a<=5);
		System.out.println("Bye");
	}
}
