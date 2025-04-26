package pattern;

public class pattern24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int rows=5;
		int star=5;
		int space=4;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				if(i==1||j==1||j==star||i==rows)
					System.out.print("*");
					else
						System.out.print(" ");
			}
			System.out.println();
			space--;
		}
	}

}
