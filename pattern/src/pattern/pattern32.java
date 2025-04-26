package pattern;

public class pattern32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	java.util.Scanner sc=new java.util.Scanner(System.in);
	
	System.out.println("Enter n");
	int n=sc.nextInt();
	int star=1;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=star;j++)
		{
			if(j==1||j==star)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
		if(i<=n/2)
		 star++;
		else
			star--;
	}
			

	}

}
