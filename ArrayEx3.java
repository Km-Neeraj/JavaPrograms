import java.util.Scanner;

public class ArrayEx3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[5];

		System.out.println("Enter "+a.length+" values of array");
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter "+(i+1)+" value");
			a[i]=sc.nextInt();
		}
		
		System.out.println("Values are:");
		for(int x:a) {
			System.out.println(x);
		}
		
		
		sc.close();
	}
}
