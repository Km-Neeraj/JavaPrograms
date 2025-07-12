class A{
                         static final int x=67;
                         static final int y;
                         static 
                         {
                                                  y=9;
                                                  System.out.println("static block executed");
                         }

                         {
                               System.out.println("Initialize Block executed");                    
                         }
}
public class FinalEx3 {
                         public static void main(String[]abc)

                         {
                                                  System.out.println(A.x);
                                                  System.out.println(A.y);
                         }
                         
}

/*  
   static block executed
    67
     9 */
