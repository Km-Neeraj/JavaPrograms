
@FunctionalInterface
interface Sum{
	void add(int x,int y);
}
public class LambdaEx2 {
	public static void main(String[] args) {
//		Sum a=(int x,int y)->{
//			int r=x+y;
//			System.out.println("Sum: "+r);
//		};
		
//		Sum a=(int h, int j)->{
//			int r=h+j;
//			System.out.println("Sum: "+r);
//		};
		
//		Sum a=(x, y)->{
//			int r=x+y;
//			System.out.println("Sum: "+r);
//		};
		
		Sum a=(m, n)->{
			int r=m+n;
			System.out.println("Sum: "+r);
		};
		
		a.add(9,8);
		a.add(78,58);
		a.add(19,80);
	}
}
