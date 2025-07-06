
public class PatternEx10 {
	public static void main(String[] args) {
		int rows=9;
		int star=1;
		int space=rows-1;
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			
			if(i<=rows/2) {
				star++;
				space-=2;
			}
			else {
				star--;
				space+=2;
			}
			System.out.println();
		}
	}
}
