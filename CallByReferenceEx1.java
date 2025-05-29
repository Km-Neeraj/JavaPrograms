class Animal{
	String name;
	int age;
	void show() {
		System.out.println(name+" "+age);
	}
	Animal(String n,int a){
		name=n;
		age=a;
	}
}
public class CallByReferenceEx1 {
	public static void main(String[] args) {
		Animal a = new Animal("Tiger",6);
		a.show();
		fun(a);
		a.show();
	}
	static void fun(Animal a) {
		a.name="Cheetah";
	}
}
