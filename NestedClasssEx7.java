class A {
                         abstract class B 
                         {
                                                  abstract void method();
                         }
                         {
                                                  B b=new B(){
                                                     void method()
                                                     {
                                                                           System.out.println("BBB");

                                                     }

                                                  };
                                                  b.method();
                         }
}

public class NestedClasssEx7 {
                         public static void main(String[]abc)
                         {
                         new A();
                         }
                         
}

//output=BBB
