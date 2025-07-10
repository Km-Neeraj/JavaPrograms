
public class FunctionExSI {
	static double calculateSI(double p,double r,double t) {
		double si=p*r*t/100;
		
		return si;
	}
	
	static void calculateSI2(double p,double r,double t) {
		double si=p*r*t/100;
		System.out.println("Simple interest :"+si);
	}
	
	public static void main(String[] args) {
		double res=calculateSI(12000,2.5, 5);
		System.out.println(res);
		
		System.out.println(calculateSI(1300,6,4.5));
		
		calculateSI2(12000, 2.5, 5);
	}
}
