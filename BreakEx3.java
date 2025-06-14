
public class BreakEx3 {
	public static void main(String[] args) {
		int a=1;
		while(a<=5) {
			System.out.println("Hello");
			if(a==3){
				break;
			}
			a++;
			System.out.println("Incapp");
		}
		System.out.println("Bye");
	}
}
