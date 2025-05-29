class Bird{
	String name;
	int age;
	void show() {
		age++;
		System.out.println(name+" "+age);
	}
	Bird(String n,int a){
		name=n;
		age=a;
	}
	void m(Bird b) {
		b.age+=5;
		b=new Bird("Abc",4);
		b.name="KK";
	}
}
public class CallByReferenceEx3 {
	public static void main(String[] args) {
		Bird a = new Bird("Xyz",5);
		a.show();
		a.m(a);
		a.show();
	}
}
