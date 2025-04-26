package pattern;

public class pattern26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int rows=9;
		int star=1;
		int col=10;
		int spce=rows-2	;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=col;j++)
			{
				if(j==1||j<=star||j>(col-star))
				{
					System.out.print("*");
				}
				else
				{
					
					
					      System.out.print(" ");
			     }
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

		

	


