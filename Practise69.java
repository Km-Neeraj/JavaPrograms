interface A{
    default void display()
    {
                         System.out.println("A");
    }
}
abstract class B{
                         abstract void display();

}
class C extends B implements A 
{
                         public void display()
                         {
                              System.out.println("C");
                         }
}
public class Practise69 {
                         public static void main(String[]abc)
                         {
                             C obj=new C();
                             obj.display();
                             
                         }
                         
}
