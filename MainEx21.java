
class A{
                         static 
                         {
                                                  System.out.println("Static block of A");
                         }
                         A()
                         {
                                                  System.out.println("Constructor of A");

                         }
                         {
                                                  System.out.println("Initialization Block of A");
                         }

                         void show()
                         {
                                                  System.out.println("A's Show");
                         }
}

class B extends A{
                         static 
                         {
                                                  System.out.println("Static block of B");
                         }

                         B()
                         {
                                                  System.out.println("Constructor of B");
                         }

                         {
                                                  System.out.println("Initialization block of B's");
                         }

                         void show()
                         {
                                                  System.out.println("B's Show");
                         }
}



                         public class MainEx21{
                         
                                                  public static void main(String[] abc)
                                                  {
                                                                           A obj=new B();
                                                                           obj.show();
                                                  }
                         }
                         
/* output =
       Static block of A
       Static block of B
       Initialization Block of A
       Constructor of A
       Initialization block of B's
       Constructor of B
       B's Show
 */
