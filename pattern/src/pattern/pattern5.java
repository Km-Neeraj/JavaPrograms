package pattern;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rows=5;
		int space=4;
		int star=1;
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
			star+=2;
			space--;
		}

	}

}
