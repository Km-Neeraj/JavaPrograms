import java.util.HashMap;
import java.util.Scanner;

public class CollectionAssignmentQues3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two Strings:");
		String s1=sc.next();//hii
		String s2=sc.next();//ihi
		
		if(s1.length()==s2.length()) {
			HashMap< Character, Integer> h=new HashMap<Character, Integer>();
			
			for(char c:s1.toCharArray()) {
				if(h.containsKey(c)) {
					h.put(c, h.get(c)+1);
				}
				else {
					h.put(c, 1);
				}
			}
			
			for(char c:s2.toCharArray()) {
				
				if(h.containsKey(c)) {
					h.put(c, h.get(c)-1);
					
					if(h.get(c)==0) {
						h.remove(c);
					}
				}else {
					System.out.println("Not Anagram");
					break;
				}
			}
			
			if(h.isEmpty()) {
				System.out.println("Anagram");
			}

		}else {
			System.out.println("Not Anagram!!");
		}
	}
}
