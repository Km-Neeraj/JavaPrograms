
public class PatternEx4 {
	public static void main(String[] args) {
		int rows=10;
		
		int star=1;
		int space=rows-1;
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			star++;
			space--;
			System.out.println();
		}
	}
}
