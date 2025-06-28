import java.util.TreeSet;

public class TreeSetEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TreeSet s=new TreeSet();
		
		s.add(10);
		s.add(12);
		s.add(13);
		s.add(90);
		s.add(200);
		s.add(200);
		s.add(200);
		
		System.out.println(s);
		
		
		//2nd way to traverse TreeSet object
		
		for(Object x:s)
		{
			System.out.println(x);
		}
		
		
		//remove TreeSet Object
		
		s.remove(10);
		s.remove(12);
		System.out.println(s);
		
		
		//2nd way to remove TreeSet element
		
		s.remove((Integer)200);
		
		System.out.println(s);
		
		
		//clear all object of TreeSet in one go
		
		s.clear();
		
		System.out.println(s);
		
		
		
		
	}

}
