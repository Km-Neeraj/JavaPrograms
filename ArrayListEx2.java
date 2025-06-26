import java.util.*;

public class ArrayListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList a=new ArrayList(56);     //we can also add ArrayList capacity
		
		a.add(12);
		a.add("ram");
		a.add(12.89f);
		a.add(34);
		System.out.println(a);
		//a.remove((Integer)0);
		a.remove(0);
		System.out.println(a);
		
		
		ListIterator l=a.listIterator();

		System.out.println(l.next());
		System.out.println(l.next());
		System.out.println(l.next());
		//System.out.println(l.next());
		
		System.out.println("print previous element ");  // but till the elemnt that is traversed by next method
		

		System.out.println(l.previous());
		System.out.println(l.previous());
		//System.out.println(l.previous());
		//System.out.println(l.previous());
		
		
		
		
		
		
		

		
		
		

	}

}
