
public class ArrayEx5 {
	public static void main(String[] args) {
		
		int a[]={12,10,104,6,18,19};
		
		//to access in reverse order
//		for(int i=a.length-1;i>=0;i--) {
//			System.out.println(a[i]);
//		}
		
		//to print even
		
//		for(int i=0;i<a.length;i++) {
//			if(a[i]%2==0) {
//				System.out.println(a[i]);
//			}
//		}
//		
//		for(int x:a) {
//			if(x%2==0) {
//				System.out.println(x);
//			}
//		}
		
		int sum=0;//12 22 36 42 60 79
		
		for(int x:a) {
			sum+=x;
		}
		
		System.out.println(sum);
		
	}
}
