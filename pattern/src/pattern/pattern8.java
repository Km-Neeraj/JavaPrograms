package pattern;

public class pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int star=1;
		int rows=9;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<=rows/2)
			{
				star++;
			}
			else
			{
				star--;
			}
		}

	}

}
