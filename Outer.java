public class Outer 
{
                         void display()
                         {
                                                  System.out.println("Inside Anonymous Inner");
                         }
                         public static void main(String[]abc)
                         {
                                                  Outer outer=new Outer()
                                                  {
                                                                           void display()
                                                                           {
                                                                                                    System.out.println("Inside Anonymous Inner");
                                                                           }
                                                  };
                         outer.display();
                                                  
                         }  
}

//Inside Anonymous Inner

