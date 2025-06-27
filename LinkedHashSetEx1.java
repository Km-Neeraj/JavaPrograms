import java.util.*;

public class LinkedHashSetEx1 {

	public static void main(String[] args) {
		   //HashSet a=new HashSet();
		   
		   LinkedHashSet a1=new LinkedHashSet();
		   
		   a1.add(10);
		   a1.add(20);
		   a1.add(30);
		   a1.add("Ram");
		   System.out.println(a1);
		    
		   HashSet a=new HashSet();
		   
		   a.add(10);
		   a.add(20);
		   a.add(10);
		   a.add("Ram");
		   a.add("Shyam");
		   
		   System.out.println(a);
		   
		   
		   TreeSet s=new TreeSet();
		   
		   s.add(12);
		   s.add(13);
		   s.add(100);
		   s.add(-12);
		   s.add(34);
		   s.add(12);
		   s.add(0);
		   
		   System.out.println(s);
		   
		   
		   
		   
		   
		   
		//TreeSet,LinkedSet is a child of HashSet  
		 // HashSet is used to print collection object for removing duplicate with random order element print
		  // LinkedHashSet is used for printing object with the order in which order they all are entered with remove duplicate 
		   //while TreeSet is used for printing object in increasing order without remove duplicate element but there is the need of adding 
		   // same type of object because we can traverse element in natural order(increasing order) when it is in one type of object like int, float, char or String
		   
		   
		   

	}

}
