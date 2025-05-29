class Human{
	String name;
	int age;
	void show() {
		age++;
		System.out.println(name+" "+age);
	}
	Human(String n,int a){
		name=n;
		age=a;
	}
}
public class CallByReferenceEx2 {
	public static void main(String[] args) {
		Human a = new Human("Ram",16);
		a.show();
		fun(a);
		a.show();
	}
	static void fun(Human a) {
		a.show();
		a.name="Tina";
	}
}
