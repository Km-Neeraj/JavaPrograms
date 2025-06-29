
public class PatternEx5 {
	public static void main(String[] args) {
		
		int rows=5;
		int star=1;//3  5  7 9
		int space=rows-1;//4 3 2 1 0
		for(int i=1;i<=rows;i++) {
			
			for(int k=1;k<=space;k++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			star+=2;
			space--;
			System.out.println();
		}
	}
}
