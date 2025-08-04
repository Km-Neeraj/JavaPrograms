import java.util.*;
public class Practise33 {
                         public static void main(String[]abc)
                         {
                            //create HashSet
                             HashSet s=new HashSet();
                             //add elements in HashSet
                             s.add(12);
                             s.add(19);
                             s.add(10);
                             s.add(67);
                             s.add(11);
                             s.add(11);
                             s.add(11);

                             System.out.println(s);

                             System.out.println("second way to print Hashset elements");
                             for(Object ob: s)
                             {
                                System.out.println(ob);                    
                             }

                             Iterator i=s.iterator();

                             System.out.println("Third way to print Hashset elements");
                             while(i.hasNext())
                             {
                                System.out.println(i.next());
                             }
                             
                              
                         

                         }
                         
}
