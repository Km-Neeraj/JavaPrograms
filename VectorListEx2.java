import java.util.*;

public class VectorListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector a=new Vector();
		                             //it supports duplicacy with indexing with advance feature Enumeration for traverse vector elements
		a.add(100);
		a.add("Ram");
		a.add("Ramayana");
		a.add("hii");
		a.add("yash");
		a.add("hey!!!");
		a.add(12);
		a.add(123);
		a.add(123);
		System.out.println(a);
		
		System.out.println(a.get(2));
		System.out.println(a.get(0));
		
		
		a.remove((Integer)100);
		System.out.println(a);

		System.out.println(a.size());
		
		a.remove(3);
		System.out.println(a);
		a.remove((Integer)12);
		
		System.out.println(a);
		
		
		System.out.println("1st way to tarverse Vector elements Using for each");
		for(Object o:a)
		{
			System.out.println(o);
		}
		
		
		System.out.println("2nd way to traverse vector elements using Iterator");
		
		Iterator s=a.iterator();
		
		while(s.hasNext())
		{
			System.out.println(s.next());
		}
		
		
		System.out.println("3rd Way of traversing Vector elements  using Enumeration ");
		
		
		Enumeration e=a.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		
		
		
		
}
}
