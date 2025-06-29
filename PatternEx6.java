
public class PatternEx6 {
	public static void main(String[] args) {
		
		int rows=9;
		int star=1;
		int space=4;
		for(int i=1;i<=rows;i++) {
			for(int k=1;k<=space;k++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			if(i<=rows/2) {
				star+=2;
				space--;
			}
			else {
				star-=2;
				space++;
			}
			System.out.println();
		}
	}
}
