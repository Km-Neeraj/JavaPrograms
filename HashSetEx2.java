import java.util.Arrays;
import java.util.HashSet;

public class HashSetEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int arr[]= {11,23,12,11,2,24,23,12,23,90,90};
		  
		  HashSet h=new HashSet();
		  
		  for(int x:arr)
		  {
			  h.add(x);
		  }
		  
		  System.out.println(h);
		  
		  
		  int res[]=new int[h.size()];
		  int i=0;
		  for(Object o:h)
		  {
			  res[i]=(Integer)o;
			  i++;
		  }
		  System.out.println(Arrays.toString(res));
		  
		  
	}

}
