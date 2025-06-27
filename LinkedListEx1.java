import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedList l=new LinkedList();    //LinkedList supports duplicate with indexing with advance feature addFirst and addLast
		l.add(12);
		l.add(123);       //it adds normal as order in which order elements are added 
		l.add("Ram");
		l.add("Yash");
		l.add("Suraj");
		l.add(900);
		l.add(67.0);
		l.add(87.6f);
		
		System.out.println(l);
		
		
		System.out.println("2nd way to add elements in Linked List");
		
		l.addFirst(100);    //it adds elements first means LiFO order
		l.addFirst(34);
		l.addFirst("Hari");
		System.out.println(l);
		
		
		System.out.println("3rd way of adding elements in Linked List");
		
		
		
		l.addLast(90.786);
		l.addLast(23.6f);;
        l.addLast(2.88888);
        
        System.out.println(l);
        
        
        l.remove(87.6f);
        l.remove(67.0);
        
        System.out.println(l);
        
        l.remove((Integer)900);
        System.out.println(l);
        
        System.out.println(l.get(0));
        System.out.println(l.get(5));
        
        
        
        System.out.println("Current size of Vector="+l.size());
        
        
        System.out.println("1st way of traverse LinkedListEx1 using for each");
        
        for(Object y:l)
        {
        	System.out.println(y);
        }
        
        
        System.out.println("2nd way of traverse");
        
        Iterator i=l.iterator();
        
        while(i.hasNext()) {
        	System.out.println(i.next());
        }
        
        
        System.out.println("size of LinkedList="+l.size());
        
       System.out.println(l.get(2));
       
       
       
        
        
}

}
