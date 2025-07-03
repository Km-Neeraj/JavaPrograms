class Abc{
	void m1() {
		System.out.println("Hello ABC");
	}
	void m2() {
		System.out.println("Hi ABC");
	}
	
}
interface Xyz{
	void m();
	void mm();
}

public class AnonymousNestedClassEx {
	public static void main(String[] args) {
		Abc a=new Abc() {
			void m1() {
				System.out.println("Hello Anonymous");
			}
			
			void m2() {
				System.out.println("Hi Anonymous");
			}
			
			void m3() {
				
			}
		};
		
		
		
		a.m1();
		a.m2();
		
		
		
		Xyz x=new Xyz() {

			
			public void m() {
				System.out.println("Hello Xyz");
			}

			
			public void mm() {
				System.out.println("Hello mm");
			}
		
		};
		
		x.m();
		x.mm();
	}
}
