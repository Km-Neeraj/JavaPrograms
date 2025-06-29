
public class PatternEx8 {
	public static void main(String[] args) {
		int rows=9;
		int star=rows/2+1;
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			
			if(i<=rows/2) {
				star--;
			}
			else {
				star++;
			}
			System.out.println();
		}
	}
}
