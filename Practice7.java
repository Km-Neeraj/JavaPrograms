import java.util.*;
public class Practice7 {
                         public static void main(String[]abc)
                         {
                             int row;
                             Scanner sc=new Scanner(System.in);
                             System.out.println("Enter the number of row");
                             row=sc.nextInt();
                             for(int i=1;i<=row;i++)
                             {
                                for(int j=1;j<=i;j++)
                                {
                                   System.out.print("*");
                                }
                                System.out.println();
                             }

                             for(int i=row-1;i>=1;i--)
                             {
                                for(int j=1;j<=i;j++)
                                {
                                   System.out.print("*");
                                }
                                System.out.println();
                             }
                         }
                         
}
/*   
 Enter the number of row
5
*
**
***
****
*****
****
***
**
*        */
