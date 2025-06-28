
import java.util.*;

public class vectorList {
                                                 //supports duplicacy with indexing
	public static void main(String[] args) {
		
			//ArrayList a=new ArrayList();
			Vector a=new Vector(50);    //by default its capacity 10 but after its capacity if try to enter
			                            //elements it increases its capacity by default 5
			a.add(10);
			a.add("Ram");
			a.add(7.2);
			a.add(5);
			a.add(12);
			a.add(14);
			a.add(10);
			Iterator i=a.iterator();
			while(i.hasNext()) {
				System.out.println(i.next());
			}
			
			
			System.out.println("Vector traverse using Enumeration");
			
			Enumeration e=a.elements();
			while(e.hasMoreElements()) {
				System.out.println(e.nextElement());
				
				
				System.out.println("2nd way of defining vector ");  //we can also define vector capacity and how much it will increase
				                                                   // its capacity if elements are addded after its capacity
				
				Vector v=new Vector(4,10);   //4 is capacity and if we enter 5th element then it will increase their capacity by 10
				
				v.add(10);
				v.add(10);
				v.add("jug");
				v.add(23.89);
				v.add(123);
				
				System.out.println(v);
				
				System.out.println("Size of New Vector");
				
				System.out.println(v.size());
				
				
				
				
			}
		}

	}


	


