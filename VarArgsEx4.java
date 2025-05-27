
public class VarArgsEx4 {
	public static void main(String[] args) {
		sum(12,10);
		sum(12,12,12,12);
		sum(11,9,17,11,1,1,1,1,1,11,1);
	}
	
	static void sum(int a,int b,int ...c) {
		int sum=a+b;
		for(int x:c) {
			sum+=x;
		}
		
		System.out.println("Total Sum : "+sum);
	}
}
