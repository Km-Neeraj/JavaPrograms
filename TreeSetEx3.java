import java.util.TreeSet;

public class TreeSetEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet t=new TreeSet();
		
		t.add(12.5);
		t.add(12.8);
		t.add(90.0);
		t.add(12.70);
		t.add(45.7);
		t.add(16.90);
		t.add(12.5);
		t.add(90.0);
		
		//can't store t.add(12)   classCastException generates
		
		System.out.println(t);
		
		t.remove(12.5);
		
		//2nd way to remove TreeSet
		
		t.remove((Double)90.0);
		System.out.println(t);
		
		
		//traverse Treeset Element
		
		for(Object o:t)
		{
			System.out.println(o);
		}
		
		//
		
		TreeSet ch=new TreeSet();
		ch.add('a');
		ch.add('G');
		ch.add('U');
		ch.add('b');
		ch.add('Z');
		
		System.out.println(ch);
		
		
		ch.remove((Character)'a');
		System.out.println(ch);

		
		
		TreeSet f=new TreeSet();
		
		f.add(12.7f);
		f.add(34.90f);
		f.add(12.7f);
		f.add(87.56f);
		//f.add(34.7);    can't store it because by default float is Double so attach f in the last is mandatory
		 
		System.out.println(f); 
		
		f.remove((Float)12.7f);
		System.out.println(f);
	}

}
