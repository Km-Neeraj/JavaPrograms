package pattern;

public class pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int star=5;
		int rows=5;
		for(int i=1;i<=rows;i++)
			{
			    for(int j=rows;j>=i;j--)
			    {
			    	if(j==i||i==1||j==rows)
			    	{
			    		System.out.print("*");
			    	}
			    	else
			    	{
			    		System.out.print(" ");
			    	}
			    }
			    System.out.println();
			}

	}

}
