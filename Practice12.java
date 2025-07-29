import java.util.*;
public class Practice12 {
                         public static void main(String[]abc)
                         {
                            int row,j,i;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter the number of row");
                            row=sc.nextInt();
                            for(i=1;i<=row;i++)
                            {
                               for(j=i;j<row;j++)
                               {
                                 System.out.print("_");
                               }
                               for(int k=1;k<=2*i-1;k++)
                               {
                                 if(k==1||k==(2*i-1))
                                 {
                                  System.out.print("*");
                                 }
                                 else{
                                        System.out.print(" ");
                                 }
                                
                               }
                               System.out.println();
                            }


                            for(i=row-1;i>=1;i--)
                            {
                               for(j=i;j<row;j++)
                               {
                                 System.out.print("_");
                               }
                               for(int k=1;k<=2*i-1;k++)
                               {
                                 if(k==1||k==(2*i-1))
                                 {
                                  System.out.print("*");
                                 }
                                 else{
                                        System.out.print(" ");
                                 }
                                
                               }
                               System.out.println();
                            }
                         }
                         
}
