class V{
	int x=12;
	V(int x){
		System.out.println(x);
		this.x=x;
	}
}
class HHH{
class W extends V{
	int x=10;
	W(int x){
		super(x);
		System.out.println(x++);
		this.x=super.x;
	}
	void show() {
		System.out.println(x+" "+this.x+" "+super.x);
	}
}
public class ThisSuperAsMemberExQues3 {
	public static void main(String[] args) {
		W w=new W(10);
		w.show();
	}
}
