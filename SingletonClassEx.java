//Singleton Class
class Singleton{
	int x=15;
	private static Singleton object=new Singleton();
	static Singleton getObject() {
		return object;
	}
	
	private Singleton() {
		System.out.println("Hello Singleton");
	}
}
public class SingletonClassEx {
	public static void main(String[] args) {
		Singleton s1=Singleton.getObject();
		Singleton s2=Singleton.getObject();
		Singleton s3=Singleton.getObject();
		s1.x=16;
		
		System.out.println(s1.x+" "+s2.x+" "+s3.x);
	}
}
