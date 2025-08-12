
interface A
{
     void display();
}
abstract class B implements A
{
                         public void display()
                         {
                                                  System.out.println("Inside B");
                         }
}
class C extends B{
            
}
                         public class Practise68 {
                                                  public static void main(String[]abc)
                                                  {
                                                       A obj=new C();
                                                       obj.display();
                                                  }
                         
}
//Inside B
