
public class Ques1 {
	static int i=0;
	public static void main(String[] args) {
		int g=12,i=0,c=0;
		
		i++;
		try {
			c=g/i++;
			System.out.println("Divsion : "+c);
			i++;
		}catch(ArithmeticException e) {
			i+=2;
		}
		
		
		System.out.println(i);
	}
}
