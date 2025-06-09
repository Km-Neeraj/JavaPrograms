import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIOEx13 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Line");
		String s=sc.nextLine();//Hii
		
		FileReader fr=new FileReader("abc.txt");
		Scanner sc2 = new Scanner(fr);
		ArrayList<String> a=new ArrayList<>();
		
		while(true) {
			try {
				a.add(sc2.nextLine());
			}catch (Exception e) {
				break;
			}
		}
		fr.close();
		sc2.close();
		
		a.add(2,s);
		
		FileWriter fw=new FileWriter("abc.txt");
		for(String x:a) {
			fw.write(x);
			fw.write('\n');
		}
		
		fw.close();
		fr.close();
	}

}
