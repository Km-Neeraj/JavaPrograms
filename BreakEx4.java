
public class BreakEx4 {
	public static void main(String[] args) {
		int a=1;
		do {
			System.out.println("Hello");
			if(a==3){
				break;
			}
			a++;
			System.out.println("Incapp");
		}while(a<=5);
		System.out.println("Bye");
	}
}
