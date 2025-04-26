package pattern;

public class pattern34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
	
		System.out.println("Enter number");
		
		int star=1;
		
		n=sc.nextInt();
		int space=n/2;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
			{
			   System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				if(j==1||j==star)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			
			System.out.println();
			if(i<=n/2)
			{
				star++;
				space--;
			}
			else
			{
				star--;
				space++;
			}
			}
		}
	  
				
	}


