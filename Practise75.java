class A 
{
                         static 
                         {
                                                  System.out.println("Hii");
                         }
                         A()
                         {
                                                  System.out.println("A");
                         }
                         {
                                                  System.out.println("Hehe!!");
                         }
}
class B extends A 
{
                         static 
                         {
                                                  System.out.println("Hello");
                         }
                         B()
                         {
                            System.out.println("B");
                         }
                         {
                                                  System.out.println("Haha!!");
                         }
}
public class Practise75 {
                         public static void main(String[]abc)
                         {
                             A a=new A();
                             B b=new B();
                         }
                         
}
