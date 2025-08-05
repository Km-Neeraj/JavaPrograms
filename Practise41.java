import java.util.*;
public class Practise41 {
                         public static void main(String[]abc)
                         {
                             Map<Integer,String> map=new HashMap<>();
                             //add elements in Map using key value pair
                             map.put(11,"Abc");
                             map.put(12,"Abc");
                             map.put(13,"Ram");
                             map.put(14,"Seeta");

                             System.out.println("Map elements = "+map.get(11));
                             System.out.println(map.get(13));
                             System.out.println(map.get(12));
                             System.out.println(map.get(14));
                         }
                         
}
