import java.util.*;
public class Practise42 {
                         public static void main(String[]abc)
                         {
                             Map<Integer,Integer> map=new HashMap<>();

                             //adding key value pair in HashMap
                             map.put(1,67);
                              map.put(2,68);
                               map.put(3,69);
                                map.put(5,70);
                                 map.put(6,18);
                                  map.put(7,540);

                                  System.out.println("Map elements are");
                                  for(int i=1;i<=7;i++)
                                  {
                                     System.out.println(map.get(i));
                                  }
                         }
                         
}

/*   
 67
68
69
null
70
18
540 */