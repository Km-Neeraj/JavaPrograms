class Parent{

                         int x=10;
                         int y=20;
                         static{
                                                  System.out.println("Hii");
                               }
}
class Child extends Parent{
                         int x=14;
                         void show()
                         {
                                                  System.out.println(x+" "+y);
                         }
                         static{
                                                  System.out.println("Hello");
                         }
              
}

public class ParentChildEx2 {
                         public static void main(String[] abc)
                         {
                                                  Child c1=new Child();
                                                  c1.show();
                         }
                         
}

/*Hii
Hello
14 20 */
