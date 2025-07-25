class A
{
   static 
   {
                         System.out.println("Static method invoke");
   }
   {
      System.out.println("Initialize block invoke");
   }   
   A()
   {
       System.out.println("Parent class A constructor invoke");
   }                    
}
class B extends A
{
     B()
     {
                         super();
     }
}
public class SingleInheritance1 {
                         public static void main(String[]abc)
                         {
                              B b=new B();

                         }
                         
}
/*   Static method invoke
     Initialize block invoke
     Parent class A constructor invoke  */
