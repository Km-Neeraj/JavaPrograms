class AAA{
	String x;
	int y=15;
	void show() {
		System.out.println(x+" "+y);
	}
	AAA(String a,int b){ 
		System.out.println("Hello A");
		x=a;
		y=b;
	}
	AAA(String a){
		this();
		System.out.println(x+y);
		System.out.println("Ok A");
		x=a;
	}
	AAA(){
		this("KK",80);
		System.out.println("Hi A");
	}
}
public class ConstructorChainingEx4 {
	public static void main(String[] args) {
		AAA a=new AAA("GG");
		a.show();
	}
}
