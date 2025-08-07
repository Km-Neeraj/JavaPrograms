class Fun{
               

               int mul(int x,int y)
               {
                    return x*y;
               }
               int mul(int x,int y,int z)
               {
                         return x*y*z;
               }
               
               
               
}
public class PolymorphismEx2 {
                         public static void main(String[]abc)
                         {
                            Fun ob=new Fun();

                            int res1=ob.mul(12,10);
                            int res2=ob.mul(1,23,10);

                            System.out.println("Multiplication of two numbers ="+res1);
                            System.out.println("Multiplication of Three Num = "+res2);
                         }
                         
}
/* 
 Multiplication of two numbers =120
Multiplication of Three Num = 230 */
