
public class VowelOrConsonant {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter a Character");
		char c=sc.next().charAt(0);
		
		switch(c) {
		case 'a':case 'e':case 'i':case 'o':case 'u':case 'A':case 'E':case 'I':case 'O':case 'U':
			System.out.println("Vowel");
			break;
			default :
				System.out.println("Consonant");
		}
		
		sc.close();
	}
}
