import java.util.*;
public class Practise36 {
                         public static void main(String[]abc)
                         {
                            HashSet<Integer> ob=new HashSet<>();
                            ob.add(90);
                            ob.add(43);
                            ob.add(43);
                            ob.add(12);
                          
                            System.out.println("HashSet Elements are");
                            System.out.println(ob);
                            //use of size() method to get the size of HashSet that stores Unique elements 
                            System.out.println("size of HashSet = "+ob.size());
                           //use of remove() method if we want to remove a single elements 
                            ob.remove(43);

                            System.out.println("HashSet Elements after removing an element");
                            System.out.println(ob);
                            System.out.println("size of HashSet = "+ob.size());
                            //use of clear() method to remove all elements

                            ob.clear();
                            System.out.println("HashSet elements after removing all elements");
                            System.out.println(ob);
                            System.out.println("size of HashSet = "+ob.size());

                         }
}

/*   
HashSet Elements are
[90, 43, 12]
size of HashSet = 3
HashSet Elements after removing an element
[90, 12]
size of HashSet = 2
HashSet elements after removing all elements
[]
size of HashSet = 0 */
                         

