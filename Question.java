
public class Question {
	public static void main(String[] args) {
		int a[]= {12,10,17,978,14,13,6,19,67,88};
		
		int max=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		
		System.out.println(max);
		
		
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>=10&&a[i]<=15) {
				a[i]=0;
				count++;
			}
		}
		
		System.out.println(count);
		
		for(int x:a) {
			System.out.println(x);
		}
	}
}
