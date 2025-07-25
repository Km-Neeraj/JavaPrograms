interface A{
              void fun();
              default void fun1()
              {
                  System.out.println("Interface A fun1");
              }
}
interface B 
{
     void fun11();

}
class C implements A,B{
                        public void fun()
                         {
                              System.out.println("Interface A method fun Override");                    
                         }
                        public  void fun11()
                         {
                            System.out.println("Interface B method fun11 override");
                         }
     
}
public class MultipleInheritance {
                         public static void main(String[]abc)
                         {
                            A a=new C();
                                 a.fun1();
                            C c=new C();
                            c.fun();
                            c.fun11(); 
                         }
                         
}
/*    Interface A fun1
      Interface A method fun Override
      Interface B method fun11 override */
