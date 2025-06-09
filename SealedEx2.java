sealed interface AA permits BB{
	int x=10;
	void m() ;
}
final class BB implements AA{
	int y=20;
	@Override
	public void m() {
		System.out.println("Hello B");
	}
}
//class CC implements AA{ //error
//	int z=40;
//}

public class SealedEx2 {
	public static void main(String[] args) {
		BB b=new BB();
		System.out.println(b.y);
		System.out.println(b.x);
		b.m();
	}
}
