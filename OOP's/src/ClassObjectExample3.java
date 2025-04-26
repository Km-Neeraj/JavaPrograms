public class ClassObjectExample3{
	int x;
	String y;
	void show() {
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		ClassObjectExample3 a=new ClassObjectExample3();
		a.x=10;
		a.y="KK";
		ClassObjectExample3 b=new ClassObjectExample3();
		b.y="Ram";
		b.x=90;
		a.show();
		b.show();
	}
}