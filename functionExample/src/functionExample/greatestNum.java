package functionExample;

public class greatestNum {

	public static void main(String[] args) {
		
		java. util.Scanner sc=new java.util.Scanner(System.in);
		
		greatest1();  //function with no return type and no arguments
		
		greatest2(11,45,-12); //function with no return type with arguments
		
		int res=greatest3(); //function with return type with no arguments
		
		System.out.println(res);
		
		int res1=greatest4(11,-90,13);  //function with return type with arguments
		
		System.out.println("greatest among 11 ,-90, 13 = "+res1);
		
		

	}
	
	static void greatest1()
	{
		
		System.out.println();
		System.out.println();
		System.out.println();
	      System.out.println("Function with no return type with no argument invoke");
		System.out.println("Enter three numbers");
		java. util.Scanner sc=new java.util.Scanner(System.in);
	 int num1=sc.nextInt();
	 int num2=sc.nextInt();
	 int num3=sc.nextInt();
	 if(num1>num2&&num1>num3)
	 {
		 System.out.println(num1+"  is greatest among" + num1+","+num2+","+num3);
	 }
	 else if(num2>num3)
	 {
		 System.out.println(num2+ "  is greatest among " + num1+","+num2+","+num3);
	
	 }
	 else {
	 
		 System.out.println(num3+"  is greatest among"  + num1+","+num2+","+num3);
	 }
	}
	
	static void  greatest2(int num1,int num2,int num3)
	{
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Function with no return type with  argument invoke");
		if(num1>num2&&num1>num3)
		{
			System.out.println(num1+"  is greatest among " + num1+"," +num2+"," +num3);
		}
		else if(num2>num3)
		{
			System.out.println(num2 +"  is greatest among " + num1 +  "," +num2+"," +num3);
		}
		else
		{
			System.out.println(num3+" is greatest among " + num1+ ","+num2+","+num3);
		}
	}
	
	static int greatest3()
	{
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Function with  return type with no argument invoke");
		System.out.println("Enter three numbers");
		java. util.Scanner sc=new java.util.Scanner(System.in);
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		
		System.out.println("Greatest number among "+num1+","+num2+","+num3+"=");
		
		if(num1>num2&&num1>num3)
		{
			return num1;
		}
		else if(num2>num3)
		{
			return num2;
		}
		else
		{
			return num3;
		}
		

	}
	
	static int greatest4(int num1,int num2,int num3)
	{
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("Function with return type with argument invoke");
		if(num1>num2&&num1>num3)
		{
			return num1;
		}
		else if(num2>num3)
		{
			return num2;
		}
		else
		{
			return num3;
		}
	}

}
