
import java.io.IOException;

public class ConsoleIO1 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter a Character");
		int c=System.in.read();
		System.out.println("Entered Character is");
		System.out.println((char)c);
		
	}

}
