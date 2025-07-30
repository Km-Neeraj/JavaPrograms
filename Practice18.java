
interface A{
               void fun();
               int y=20;
               static int x=10;
               default void fun1()
               {
                    System.out.println("Interface Default Method");
                    System.out.println("Value of x="+x);
                    System.out.println("Value of x="+y);

               }
               

}
class B implements A
{
     public void fun()
     {
        System.out.println("Interface method override");
     }

}
public class Practice18 {
                         public static void main(String[]abc)
                         {
                         A ob=new B();
                         ob.fun();
                         ob.fun1();
                         }

                         
}
/*    
Interface method override
Interface Default Method
Value of x=10
Value of x=20 */
