import java.util.*;
public class Practice10 {
                         public static void main(String[]abc)
                         {
                             int row;
                             Scanner sc=new Scanner(System.in);
                             System.out.println("Enter the Number of row");
                             row=sc.nextInt();
                             for(int i=1;i<=row;i++)
                             {
                               for(int j=1;j<=i;j++)
                               {
                                  if(j==1||j==i||i==row)
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
/*   
Enter the Number of row
5
*
**
* *
*  *
***** */
