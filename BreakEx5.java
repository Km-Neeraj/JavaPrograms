
public class BreakEx5 {
	public static void main(String[] args) {
		System.out.println("Hii");
		for(int a=1;a<=8;a++) {
			System.out.println("Hello");
			if(a++==3){
				break;
			}else {
				a++;
			}
			System.out.println("Incapp");
		}
		System.out.println("Bye");
	}
}
