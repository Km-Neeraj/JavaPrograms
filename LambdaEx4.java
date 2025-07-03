
@FunctionalInterface
interface Square{
	int sqr(int a);
}
public class LambdaEx4 {
	public static void main(String[] args) {
		
//		Square s=(a)->{
//			int res=a*a;
//			return res;
//		};
//		
//		System.out.println(s.sqr(4));
//		
//		Square s = a -> {
//			return a * a;
//		};
//
//		System.out.println(s.sqr(9));

		Square s = a -> a * a;

		System.out.println(s.sqr(9));
	} 
}
