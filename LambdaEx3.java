
@FunctionalInterface
interface Add{
	int sum(int x,int y);
}
public class LambdaEx3 {
	public static void main(String[] args) {
		
		Add a=(x,y)->{
			int sum=x+y;
			return sum;
		};
		
		int res=a.sum(12, 12);
		System.out.println(res);
		
		System.out.println(a.sum(12, 12));
	}
}
