import java.util.*;
public class Practice6 {
                         public static void main(String[]abc)
                         {
                             int row;
                             Scanner sc=new Scanner(System.in);
                             System.out.println("Enter the number of row");
                             row=sc.nextInt();
                             for(int i=1;i<=row;i++)
                             {
                                for(int j=row;j>i;j--)
                                {
                                   System.out.print(" ");
                                }
                                for(int k=1;k<=2*i-1;k++)
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
   ***
  *****
 *******
*********    */
