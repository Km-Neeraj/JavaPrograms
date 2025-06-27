import java.util.Arrays;
import java.util.HashSet;

public class HashSetEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x[]= {"Ram","Ram","ram","Yash"};
		
		HashSet h=new HashSet();
		
		for(String s:x)
		{
			h.add(s);
		}
		
		
		System.out.println(h);
		
		
		String res[]=new String[h.size()];
		int i=0;
		for(Object o:h)
		{
			res[i]=(String)o;
			i++;
		}
		
		System.out.println(Arrays.toString(res));
		
		
		

	}

}
