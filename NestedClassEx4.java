class A 
{
                         void methodA1(int i)
                         {
                                                  System.out.println(i+++i);

                         }
                         void methodA2(int i)
                         {
                                                  System.out.println(--i-i--);
                         }
                         
}
public class NestedClassEx4 {
                         public static void main(String[]abc)
                         {
                                                  A a=new A();
                                                  a.methodA1(10);
                                                  a.methodA2(10);
                         }
                         
}
