
                         class A{
                                                  final void m1() // final method
                         {
                                                  System.out.println("Hello by A's Final Method");
                         }
                         void m2()
                         {
                                                  System.out.println("Hii from Not Final A's  Method m2");
                         }
                         

}
class B extends A{
                         void m1(int h)
                         {
                                                  System.out.println("Hello from Child Class B");
                         }
                         void m2()
                         {
                                                  System.out.println("Hello From Non parametrized B's Method");
                         }
}
public class FinalEx5{

                         public static void main(String[]abc)
                         {
                                                  B b=new B();
                                                  b.m1();
                                                  b.m2();
                         }
                         
}

/*    Hello by A's Final Method
     Hello From Non parametrized B's Method */
