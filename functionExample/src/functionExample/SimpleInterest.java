package functionExample;

public class SimpleInterest {
	
	public static void main(String[]abc)
	{
		
		si1();
		
		si2(5000,8,2);
		
		float res=si3();  
		
		System.out.println("simple interest ="+res);
		
		float res1=si4(6000,10,3);
		
		System.out.println("simple interest = "+res1);
		
		
		
		
		
		
	}
	
	
	static void si1()
	{
		System.out.println("function with no return type with no argument invoke");
	    
	    System.out.println();
	    
	    float p,r,t,si;
	    p=1300;
	    r=12;
	    t=2;
	    
	    si=(p*r*t)/100;
	    
	    System.out.println("simple interest =" +si);
	}
	
	static void si2(float p,float r,float t)
	{
		System.out.println();
		
		System.out.println("function with no return type with  argument invoke");	
		float si=(p*r*t)/100;
		System.out.println(" simple Interset =" +si);
		
	}
	
	static float si3()
	{
		
		System.out.println();
		System.out.println();
		System.out.println("function with return type with no argument invoke");
		
		float p,r,t,si;
		
		p=1100;
		r=10;
		t=3;
		si=(p*r*t)/100;
		
		return si;
		
		
	}
	
	static float si4(float p,float r,float t)
	{
		System.out.println();
		System.out.println();
		System.out.println("function with return type with argument invoke");
		float si=(p*r*t)/100;
		return si;
		
	}

}
