package pattern;

public class pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows=9;
		int space=4;
		int star=1;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<=rows/2)
			{
				star+=2;
				space--;
			}
			else
			{
				star-=2;
				space++;
			}
		}
	}

}
