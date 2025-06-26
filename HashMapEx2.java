import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx2 {

	public static void main(String[] args) {                                 //legacy class is a class that is the part of java from 1st version
		// TODO Auto-generated method stub
		                                                     //HashMap add in java Collection framework from java 2nd version  
		
		HashMap ex=new HashMap();
		
		ex.put(78,12);
		ex.put("aa", 'j');                                                     //Generic means it collects only similar type of elements 
		                                                                       //i.e.,Homogeneous  collection of object
		                                                       // Non Generic means Collection of Heterogeneous elements 
		ex.put(6, 34.89f);
		
		Set s=ex.keySet();    //it will use to print only key value of HashMap
		
		Iterator s1=s.iterator();
		
		while(s1.hasNext()) {
			System.out.println(s1.next());
		}
		
		Set o=ex.entrySet();   //it will print key with its value    
		Iterator i1=o.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		
		
		
		
		

	}

}
