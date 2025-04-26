package pattern;

public class pattern28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int star=1;
		int space=4;
		int rows=9;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				if(j==1||j==star)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
			if(i<=rows/2)
			{
				space--;
				star++;
			}
			else
			{
				space++;
				star--;
			}
		}

	}

}
