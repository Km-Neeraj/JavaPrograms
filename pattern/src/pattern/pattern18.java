package pattern;

public class pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int space=0;
		int star=5;
		int rows=5;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				if(j==1||j==star||i==1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			star--;
			space++;
		}

	}

}
