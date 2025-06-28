import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TreeMap t=new TreeMap();   //TreeMap works like TreeSet means it prints elements in natural like increasing order with its key
		                          // and in the context of TreeSet we need to give all Key name same type at one object because we can sort 
		                          // elements only on the basis of same type of data type
		
		t.put(11, "you");
		t.put(-1, "apple");
		t.put(23, 89);
		t.put(16, 89.76);   //value can be different type
		t.put(12, 89);
		
		
		System.out.println(t);  
		
		
		TreeMap t1=new TreeMap();
		
		t1.put("abc",78.90);
		t1.put("xyz", 87.0);
		t1.put("rty", "UOOO");
		t1.put("opt", 'b');     
		t1.put("YOU", 76);      //in the case of Uppercase and Lowercase it arranges elements on the basis of ASCII value otherwise it 
		                        // it arrange elements on behalf of alphabet
		
		System.out.println(t1);
		
		t1.put("abc", "you");   // it will update existing abc value 78.90 with you
		
		System.out.println(t1);
		
		
		t1.putIfAbsent("agu", 90);  //it will add new element if agu key name not already present above otherwise it will not override the value of agu
		System.out.println(t1);
		
		
		t1.remove("agu");   //remove agu key with its value 90
		
		System.out.println(t1);
		
		
		System.out.println("size of TreeMap ="+t1.size());
		
		
		//traverse TreeMap elements
		  Set s=t1.entrySet();
		  
		  System.out.println("Traverse TreeMap Elements");
		  
		  Iterator i=s.iterator();
		  
		  while(i.hasNext()) {
			  System.out.println(i.next());
		  }
		  
		  
		  //prints only Key name 
		  
		  System.out.println("Prints only Key Name ");
		  
		  Set s1=t1.keySet();
		  Iterator i1=s1.iterator();
		  
		  while(i1.hasNext()) {
			  System.out.println(i1.next());
		  }
		  
		 //prints only value 
		  System.out.println("prints only Value not the key");
		   Set s3=t1.keySet();
		   Iterator i2=s3.iterator();
	      while(i2.hasNext()) {
	    	     System.out.println(t1.get(i2.next()));
	      }
		  
		  
		  
		  
		
		
	}

}
