import java.util.*;
public class Practice13 {
                         public static void main(String[]abc)
                         {
                            int row;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter the number of row");
                            row=sc.nextInt();
                            for(int m=1;m<=5;m++)
                            {

                            for(int i=1;i<=row;i++)
                            {
                              for(int j=i;j<row;j++)
                              {
                                 System.out.print(" ");
                              }
                              for(int k=1;k<=2*i-1;k++)
                              {
                                System.out.print("*");
                              }
                              for(int l=row;l>i;l--)
                              {
                                System.out.print(" ");
                              }
                            
                            System.out.println();
                            }
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
*********
    *    
   ***   
  *****  
 ******* 
*********
    *    
   ***   
  *****
 *******
*********
    *
   ***
  *****
 *******
*********
    *
   ***
  *****
 *******
********* */
