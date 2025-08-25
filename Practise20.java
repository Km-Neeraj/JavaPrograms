public class Practise20 {
                         public static void main(String[]abc)
                         {
                             for(int i=1;i<=5;i++)
                             {
                                for(int j=i;j<=5;j++)
                                {
                                    System.out.print(" ");
                                }
                                for(int k=1;k<=i;k++)
                                {
                                   if(k==1||k==i||i==5)
                                   {
                                                  System.out.print("*"+" ");
                                   }
                                   else{
                                                  System.out.print("  ");
                                   }
                                }
                                System.out.println();
                             }
                         }
                         
}
