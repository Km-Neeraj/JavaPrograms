interface A 
{
                         default void display()
                         {
                             System.out.println("A");
                         }
}
abstract class B implements A 
{
    public abstract void display();
    
}
class C extends B 
{
                         public void display()
                         {
                             System.out.println("C");
                         }
}
public class Practise70 {
                         public static void main(String[]abc)
                         {
                           C obj=new C();
                           obj.display();
                         }
                         
}
