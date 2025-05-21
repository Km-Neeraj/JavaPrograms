
public class ArrayEx1 {
	public static void main(String[] args) {
//		int a1=12;
//		int a2=15;
//		int a3=16;
//		int a4=18;
		
		int [] a;//array declaration
		a=new int[5];//array creation
		
		System.out.println(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
//		System.out.println(a[5]);//runtime error
		
		a[0]=12;//array initialisation
		a[1]=16;
		a[2]=17;
		a[3]=19;
		a[4]=7;
		
		a[0]=19;
		
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);
//		System.out.println(a[4]);
		
		//Normal for loop
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		//for each loop or enhanced for loop
		
		for(int y:a) {
			System.out.println(y);
		}
	}
}







