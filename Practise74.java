class A 
{
                         int x=10;
                         static 
                         {
                                                  System.out.println("Hii");
                         }
                         A()
                         {
                                                  System.out.println("A");
                         }
}
class B extends A 
{
                         int y=20;
                         void show()
                         {
                            System.out.println("Hello");
                         }
                         B()
                         {
                             System.out.println("B");
                         }
}
public class Practise74 {
                         public static void main(String[]abc)
                         {
                                                  B b1=new B();
                                                  b1.show();
                                                  B b2=new B();
                                                  b2.y=56;
                                                  b2.show();
                         }
                         
}
