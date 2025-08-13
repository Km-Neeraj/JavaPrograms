class A 
{
                         int x;
                         static int y;
                         A()
                         {
                                                  System.out.println("Hii A");
                         }
                         A(int a)
                         {
                            x=a; System.out.println("Hello A");
                            
                         }
                         static 
                         {
                                                  y=15;
                                                  System.out.println("class Loaded");
                         }
                         {
                                                  System.out.println("Object Created");
                         }
}
public class Practise76 {
                         public static void main(String[]abc)
                         {
                           System.out.println(A.y);
                           A a=new A();
                           A a2=new A(4);
                           System.out.println(a.x);
                           System.out.println(a2.x);
                         }
                         
}
