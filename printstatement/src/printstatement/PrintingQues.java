package printstatement;

public class PrintingQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=10,b=5;
		System.out.println(a+b+"hii"+a);    //10
		
		System.out.println(a+b+"hii"+'a');    //15hia
		
		System.out.println('a'+b+"hii"+a+'b');   //102hii10b 
		
		System.out.println('a'+'b'+"hii"+'a'+'b');   //195hiiab
		
		System.out.println(a*3+"hii"+b*2);   //30hii10
		
		System.out.println(3-b+"hii"+'a'+3);  //-2hiia3
		
		System.out.println(b*a/3-2+"hii"+b/2);   //14hii2
		
		System.out.println(a+b);   //15
		
		System.out.println("sum="+a+b);  //sum=105
		
		System.out.println("sum= "+(a+b));  //sum= 15
		
		System.out.println(a/3*b+a-b+"Hello"+a*b/3+'a');  //20Hello16a
		
		
	}

}
