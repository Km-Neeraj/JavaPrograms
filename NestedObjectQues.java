class P{
	static int x=12;
	static {
		System.out.println("Hii");
	}
}
class Q{
	static int y=15;
	static {
		System.out.println("Hello");
	}
}
class R{
	P p=new P();
	Q q=new Q();
	
	static int z=12;
	
	static {
		System.out.println("Heyy");
	}
	
	void m() {
		System.out.println("Byee");
	}
}
public class NestedObjectQues {
	public static void main(String[] args) {
		System.out.println(R.z);
		R r=new R();
		r.m();
	}
}
