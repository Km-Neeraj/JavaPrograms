
public class CLAEx {
//	static public void main(String []args){
	static public void main(String ...args){
		System.out.println("Hello");
		System.out.println(args.length);
		for(String x:args){
			System.out.println(x);
		}
		System.out.println("Bye");
	}

}
