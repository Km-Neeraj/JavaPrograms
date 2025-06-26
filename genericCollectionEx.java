import java.util.HashMap;
import java.util.HashSet;

public class genericCollectionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> h=new HashSet<Integer>();
		
		h.add(12);
		h.add(23);
		//h.add("uyt");   // it will gebnerate error because it is generic collection means it only contain same type of object either int,float ,double,string and so on
		
		h.add(234);
		System.out.println(h);
		
		//2nd way of making Collection generic collection
		
		HashSet<Integer> h3=new HashSet();
		
		h3.add(89);
		h3.add(90);
		h3.add(677);
		h3.add(45);
		h3.add(45);  //remove duplicacy 
		h3.add(45);
		
		System.out.println(h3);
		
		//3rd way  
		
		HashSet<Integer> h4=new HashSet<>();
		
		//way of making HashMap as generic collection
		
		
		HashMap<String,Integer> h6=new HashMap();  //here String is Key type and Integer is value type
		
		
		
		

	}

}
