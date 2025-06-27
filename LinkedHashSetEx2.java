import java.util.*;

public class LinkedHashSetEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet a=new LinkedHashSet();
		
		a.add(12);
		a.add("Ram");
		a.add("Hari");
		a.add('a');
		a.add(12.900);
		a.add(12);
		a.add(23.90f);
		
		System.out.println(a);
		
		System.out.println("collection tarverse by For each loop");
		
		for(Object o:a)
		{
			System.out.println(o);
		}
		
		System.out.println("collection tarverse by Iterator's iterator method");
		
		Iterator i=a.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println(a.isEmpty());  // return true because collection is not empty
		
		System.out.println("Size of Collection ");
		
		System.out.println(a.size());  //return size
		
		
		System.out.println("remove collection object");
		a.remove(12);  
		System.out.println(a);
		
		//clear all object in one go 
		
		
		a.clear();
		System.out.println(a.isEmpty());  //return true because collection is empty
		
		
		
		
		
		
		
		
		  
		
		
		
		

	}

}
