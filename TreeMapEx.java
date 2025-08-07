import java.util.*;
public class TreeMapEx {
                         public static void main(String[]abc)
                         {
                             TreeMap a=new TreeMap();
                             a.put("abc",10);
                             a.put("xyz","Ram");
                             a.put("pqr",7.2);
                             a.put("tuv",10);
                             a.put("mno",5);
                             System.out.println(a);
                             Set s=a.entrySet();
                             Iterator i=s.iterator();
                             while(i.hasNext())
                             {
                                System.out.println(i.next());
                             }

                         }
                         
}
