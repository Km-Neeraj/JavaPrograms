import java.util.*;
public class Practise40 {
                         public static void main(String[]abc)
                         {
                            String arr[]={"Ram","Shyam","Ram","Ram","Tina"};

                            Set<String> set=new HashSet<>();
                            for(String n:arr)
                            {
                               set.add(n);
                            }

                            System.out.println("Unique String list after removing duplicate elements "+set);

                         }
                         
}
