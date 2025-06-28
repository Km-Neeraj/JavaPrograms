import java.util.TreeSet;

public class TreeSetEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TreeSet t=new TreeSet();
		 
		
		t.add("abc");
		t.add("Ram");
		t.add("Shyam");
		t.add("RamaYana");
		t.add("APPLE");
		t.add("Ram@gmail.com");
		
		System.out.println(t);
		
		
		//2nd way of traversing element of TreeSet
		
		for(Object o:t)
		{
			System.out.println(o);
		}
		
		
		//remove object of TreeSet
		
		t.remove("abc");
		
		System.out.println(t);
		
		//2nd way of removing element 
		
		t.remove((String)"Ram");
		System.out.println(t);
		
		for(Object o1:t)
		{
			System.out.println(o1);
		}
		//clear all object of TreeSet in one go
		
		t.clear();
		
		System.out.println(t);
		
		
		
		
		

	}

}
