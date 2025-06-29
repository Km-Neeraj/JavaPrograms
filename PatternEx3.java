
public class PatternEx3 {
	public static void main(String[] args) {
//		int row=5;
//		int star=row;
//		for(int j=1;j<=row;j++) {
//			for(int i=1;i<=star;i++) {
//				System.out.print("*");
//			}
//			star--;
//			System.out.println();
//		}
		
		
		int row=5;
		
		for(int i=row;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
