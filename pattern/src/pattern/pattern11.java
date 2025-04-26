package pattern;

public class pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int star=5;
		int rows=5;
		int space=0;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();			
			space++;
		}
	}

}
