//print triangle
import java.util.*;
public class Practice4 {
                         public static void main(String[]abc)
                         {
                                                  int row;
                                                  System.out.println("Enter the number of row");
                                                  Scanner sc=new Scanner(System.in);
                                                  row=sc.nextInt(); 
                           for(int i=1;i<=row;i++)
                           {
                              for(int j=1;j<=i;j++)
                              {
                                 System.out.print("*"+" ");
                              }
                              System.out.println();
                           }
                         }
                         
}
/*    
Enter the number of row
5
* 
* * 
* * * 
* * * * 
* * * * *       */
