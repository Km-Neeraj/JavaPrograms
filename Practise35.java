import java.util.*;
public class Practise35 {
                         public static void main(String[]abc)
                         {
                             HashSet<Integer> s=new HashSet<>();
                             s.add(78);
                             s.add(54);
                             s.add(12);
                             s.add(12);
                             s.add(73);

                             //contains() method to check whether element is present in the HashSet or not
                            System.out.println( s.contains(12));  //if present then it returns true otherwise returns false

                             System.out.println("HashSet Elements");

                             System.out.println(s);
                         }
                         
}
