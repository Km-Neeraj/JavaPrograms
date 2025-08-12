interface A 
{
    default void display()
    {
                         System.out.println("A");
    }

}
abstract class B implements A 
{
    
}
class C extends B 
{

}
public class Practise71 {
                         public static void main(String[]abc)
                         {
                           C obj=new C();
                           obj.display();
                         }
                         
}
