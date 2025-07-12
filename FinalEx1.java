

class A{
                         final int x;
                         A()
                         {
                                                  x=77;
                         }
                         static final int y;
                         static 
                         {
                                                  y=9;
                                                  System.out.println("Hii");
                         }

          }
                        
          
          public class FinalEx1 {

                         public static void main(String[]abc)
                         {
                                                  A a1=new A();
                                                  System.out.println(a1.x+" "+a1.y);
                         }
                         
          }


          /*  Hii
              77 9 */