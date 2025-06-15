public class ContinueEx3 {
	public static void main(String[] args) {
		for(int a=1;a<=5;a++) {
			System.out.println("Hello");
			if(a>=3){
				continue;
			}
			System.out.println("Incapp");
		}
		System.out.println("Bye");
	}
}
