
public class VarArgsEx1 {
	public static void main(String[] args) {
//		int ...a={12,123,44,55}:
		m();
		m(12);
		m(12,10);
		m(12,6,88);
		m(12,22,4,4,56,6,7,7);
		
		m(new int[] {12,3,45,5});
	}
	
	static void m(int ...a) {
		for(int x:a) {
			System.out.print(x+" ");
		}
		
		System.out.println();
	}
}
