import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedHashMap l=new LinkedHashMap();   //it works like LinkedSet it prints the element at which order they are entered 
		                                      // it doesn't support random order
		l.put(12, "Y");
		l.put(19,'l');
		l.put(10,90.76);
		
		System.out.println(l);   //prints elements
		
		l.putIfAbsent("abc", 9999);   //it will add abc=9999
		System.out.println(l);
		
		l.putIfAbsent("abc", 100);   //it will not add abc=100 because abc key is already present  even value is different like 9999 and 100
		System.out.println(l);
		
		
		Set s=l.entrySet();
		
		System.out.println("Traverse element");
		
		Iterator i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("2nd way using for each");
		
		for(Object o:s)
		{
			System.out.println(o);
		}
		
		
		l.remove(19);
		
		System.out.println(l);
		
		System.out.println("prints only key");
		Set s1=l.keySet();
		Iterator i2=s1.iterator();
		
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		
		
		System.out.println("prints only Value");
		
		Set s4=l.keySet();
		Iterator i4=s4.iterator();
		while(i4.hasNext()) {
			System.out.println(l.get(i4.next()));
		}
		
		
		
		
		
		
		
		
		
		

	}

}
