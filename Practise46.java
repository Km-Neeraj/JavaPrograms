interface Fun2
{
   void fun();
}
public class Practise46 {
                         public static void main(String[]abc)
                         {
                             Fun2 ob=()->
                             {
                                                  System.out.println("Functional Interface Implementation using Lambda expression");
                             };
                             ob.fun();
                         }
                         
}
