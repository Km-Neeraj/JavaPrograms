import java.util.*;
public class Practise15 {
                         public static void main(String[]abc)
                         {
                            int row;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter the number of row");
                            row=sc.nextInt();
                            for(int i=1;i<=row;i++)
                            {
                               for(int j=1;j<=2*row;j++)
                               {
                                  if(j==1||j==(2*row)||i==row||i==1)
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
Enter the number of row
5
**********
*        *
*        *
*        *
********** */
