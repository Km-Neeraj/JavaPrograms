
public class ForLoopEx1 {
	public static void main(String[] args) {

		for (int a = 1; a <= 5; a++) {
			System.out.println("Incapp");
		}
//		System.out.println(a);//error

		System.out.println("--------------");

		for (int a = 5; a >= 1; a--) {
			System.out.println("Incapp");
		}

		System.out.println("--------------");

		for (int a = 5; a >= 1;) {
			System.out.println("Incapp");
			a--;
		}
		System.out.println("--------------");

		int a=1;
		for(;a<=5;++a) {
			System.out.println("Incapp");
		}
		System.out.println(a);
		
		System.out.println("------------");
		
		for(int x=1;x<=5;x+=1) {
			System.out.println("Incapp");
		}
		
		System.out.println("----------------");
		int x=1;
		for(;x++<=5;) {
			System.out.println("Incapp");
		}
		System.out.println(x);
		
		System.out.println("----------------");
		
		for(int y=1;y<=5;y++) {
			System.out.println("Hello");
			--y;
		}
		System.out.println("Hii");
	}
}
