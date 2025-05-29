class Addition{
	void add(int a,int b) {
		System.out.println(a+b);
	}
	
	static void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
	double add(double a,double b) {
		System.out.println(a+b);
		return a+b;
	}
	
	void add(String a,String b) {
		System.out.println(a+b);
	}
}
public class CompileTimePolymorphismEx {
	public static void main(String[] args) {
		Addition a=new Addition();
		a.add(12, 30);
		a.add("Hii", "Hello");
		a.add(12, 10, 50);
		a.add(12.4, 10.7);
	}
}
