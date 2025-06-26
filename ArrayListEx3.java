import java.util.*;

public class ArrayListEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
 Scanner sc=new Scanner(System.in);
 
 ArrayList s=new ArrayList();
  System.out.println("Enter Arralist Object");
  System.out.println("Enter Integer value");
  int a=sc.nextInt();
  s.add(a);
  System.out.println("Enter String value");
  String  str=sc.next();
  s.add(str);
  System.out.println("Enter Double value");
  
  double d=sc.nextDouble();
  
  s.add(d);
  System.out.println("Enter Float value");
  float f=sc.nextFloat();
  s.add(f);
  
  System.out.println("Enter Character  value");
  
  char ch=sc.next().charAt(0);
  s.add(ch);
  
  
  System.out.println(s);
  
  
  
  
  
	}

}
