
class Person{
	String name;
	int age;
	
	void show() {
		System.out.println(name+" "+age);
	}
	
	public String toString() {
		return "["+name+" "+age+"]";
	}
}
public class ToStringEx {
	public static void main(String[] args) {
		Person p1=new Person();
		p1.name="Yoyo";
		p1.age=17;
		p1.show();
		
		System.out.println(p1);
		System.out.println(p1.toString());
		System.out.println(p1);
	}
}
