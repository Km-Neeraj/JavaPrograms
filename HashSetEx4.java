import java.util.*;

public class HashSetEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet s=new HashSet();
		
		s.add(90);
		s.add("Ram");
		s.add("Seeta");
		s.add("Yash");
		s.add('s');
		s.add(90.78);
		s.add(45.89f);
		
		System.out.println(s);
		
		//Traverse TreeSet object
		
		for(Object i:s)
		{
			System.out.println(i);
		}
		
		//another way of traversing element using Iterator's method which name is "iterator" and "Iterator is an interface that is implemented by all Collections
		
		System.out.println("Traverse Collection object Using Iterator ");
		Iterator i=s.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());  
			
			//hasNext method returns true until all elements are not traverse it returns false if all elements of an Collection is traversed
		}
		
		System.out.println("Total size of collection="+s.size());   //start counting from 1 not 0
		
		//next method is used to traverse next element of an collection object
		
		System.out.println(s.isEmpty());   // returns boolean true or false  returns true if Collection is empty otherwise false
		
		s.clear();
		
		System.out.println(s.isEmpty());  //return true;
		
		
		System.out.println(s.size());   //returns size 
		
		
		
		
		
		
		
		
		
			
		
		
		

	}

}
