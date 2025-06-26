import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap h=new HashMap();    // HashMap is used to enter value using key value pair
		
		h.put("abc", 10);      //put is a method of HashMap for adding element
		h.put("pqr", 78);
		h.put(12,67.89);      //just like HashSet the order of elements printing is not guaranteed it prints elements randomely
		
		
		
		System.out.println(h);
		
		//2nd thing if we want to add new value with the name of existing key then it doesn't give error it update the value of already existing key
		//let's see example
		
		h.put("abc","jug");   //update value at already exist abc=10 = jug
		
		System.out.println(h);
		
		h.put(34.56f,10);
		h.put(26.89,10);
		h.put("apple",10);   //in the context of HashMap duplicate key is not allow but duplicate value is allow
		                     // like entered value 10 three time at different key is allowed
		
		System.out.println(h);
		
		
		 //putIfAbsent method of HashMap is used to add element at the key if key is not exists already 
		//means putIfAbsent doesn't update exists key value like put method it only add if not exits key already 
		
		
		h.putIfAbsent("ooo",12);
		
		h.putIfAbsent("ooo","App");
		
		System.out.println(h);
	
		
		//we can get value by using its key name 
		
		System.out.println("Value at apple key");
		System.out.println(h.get("apple"));
		
		
		//and if we want to access value at the key name who comes multiple time then it prints the value that is entered at the kay last
		//let's see example
		
		HashMap u=new HashMap();
		
		u.put("you",90);
		u.put("you", "uuu");
		u.put("you", "Kll");  
		
		System.out.println(u.get("you"));   // it will print Kll at the key name you
		
		
		//and if we want to access value at the key name that is not exists then it will return null 
		
		System.out.println(h.get(98));   //it will print null because 98 key is not exist 
		
		
		
		h.remove("apple");   //it removes apple=10
		
		System.out.println("elements after removing apple key");
		System.out.println(h);
		
		System.out.println(h.remove("jooojo"));   //if key doesn't exist then remove retrurns null 
		
		System.out.println(h);
		
		//we can't traverse HashMap directly using for each loop or Iterator's iterator method
		
		System.out.println("Way to traverse HashMap elements ");
		
		Set s=u.entrySet();
		
		for(Object o: s)
		{
			System.out.println(o);
		}
		
		System.out.println("2nd Way of traversing HashMap ");
		
		Iterator i=s.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		 System.out.println("3rd way of traverse Hashma");
		 
		 Set s1=h.keySet();
		 
		 Iterator i1=s1.iterator();
		 while(i1.hasNext()) {
			 System.out.println(i1.next());
		 }
		 
		 
		 
		
		
			
				
		
		
		
		
		
		
		
		

	}

}
