//Check Given number is whether a prime or not
import java.util.*;
public class Practice2 {
                         public static void main(String[]abc)
                         {
                             int num;
                             int count=0;
                             Scanner sc=new Scanner(System.in);
                             System.out.println("Enter number to check whether it is Prime or not");
                             num=sc.nextInt();
                             
                             for(int i=1;i<=num;i++)
                             {
                                if(num%i==0)
                                {
                                  count++;
                                }
                             }
                             if(count==2&&num!=1)
                             {
                                System.out.println(num+" is a Prime Number");
                             }
                             else{
                               System.out.println(num+" is not a Prime Number");
                             }
                         }
                         
}

/* Enter number to check whether it is Prime or not
   7
   7 is a Prime Number   */
