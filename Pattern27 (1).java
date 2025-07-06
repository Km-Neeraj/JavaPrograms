
public class Pattern27 {
	public static void main(String[] args) {
		int rows=10;
		int star=5;
		int space=0;
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
			
			if(i<rows/2) {
				star--;
				space+=2;
			}
			else if(i>rows/2) {
				star++;
				space-=2;
			}
			System.out.println();
		}
	}
}
