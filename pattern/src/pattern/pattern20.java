package pattern;

public class pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int space=0;
		int rows=5;
		int star=9;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				if(i==1||j==1||j==star)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			space++;
			star-=2;
		}

	}

}
