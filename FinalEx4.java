
class A{
          static final int x=67;
          static final int y;
          static    //static block
          {
                         y=9;
                         System.out.println("Static block Executed");
          }
          private static final void m()  //final method
          {
                         System.out.println("Private method of A is executed");
          }
          final void m(int a)   //parametrized method
          {
                         m();   //private method call
                         System.out.println("Parametrized method executed");
          }
          

}
public class FinalEx4 {
                         public static void main(String[]abc)
                         {
                                                  new A().m(8);
                         }
                         
}

/*     Static block Executed
       Private method of A is executed
       Parametrized method executed */
