import java.util.*;

public class ArrayListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList a=new ArrayList();   //print collection object with duplicate and can access by its index value
		
		a.add(12);
		a.add("Mohan");
		a.add(23.89);
		a.add('a');
		a.add('a');
		a.add(12);
		a.add(23.89f);
		
		System.out.println(a);
		
		
		
		System.out.println(a.get(1));
		
		System.out.println("ArrayList traverse");
		
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));   //traverse element one by one in next step
		}
		
		System.out.println("Traverse ArrayList in previous step");
		
		for(int i=a.size()-1;i>=0;i--)
		{
			System.out.println(a.get(i));
		}
		
		
		
		System.out.println("Traversing using for each");
		
		for(Object o: a)
		{
			System.out.println(o);
		}
		
		a.remove((Float)23.89f);
		System.out.println(a);

		System.out.println("traversing Using Iterator's iterator");
		
		Iterator i=a.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("Remove 0th integer element");
		a.remove(0);
		
       System.out.println(a);
		
		System.out.println(a.isEmpty()); //return false;
		
		a.remove((Character)'a');  
		System.out.println(a);
		
		a.clear();
		System.out.println(a);
		
		//a.remove(12);  exception because in the case of ArrayList if we want to remove Integer object then we will have to give integer element index not directly value
		
		//index value is always in an int not in another type  
		
				
		
		
		
		
		
		
		
		
		

	}

}
