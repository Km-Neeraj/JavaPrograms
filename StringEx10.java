import java.util.StringTokenizer;

public class StringEx10 {
	public static void main(String[] args) {
		String s="I love my INDIA";
		StringTokenizer st = new StringTokenizer(s,"x");
//		StringTokenizer st = new StringTokenizer(s,"m");
//		StringTokenizer st = new StringTokenizer(s,"");
//		StringTokenizer st = new StringTokenizer(s,"k");
//		StringTokenizer st = new StringTokenizer(s,"");
		int c=st.countTokens();
		System.out.println(c);
		
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		
		for(int i=1;i<=c;i++) {
			System.out.println(st.nextToken());
		}
	}
}
