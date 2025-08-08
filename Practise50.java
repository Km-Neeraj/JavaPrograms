import java.util.*;
public class Practise50 {
                         public static void main(String[]abc)
                         {
                             int num;
                             int count=0;
                             
                             Scanner sc=new Scanner(System.in);
                             System.out.println("Enter The number to check prime or not");
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
                               System.out.println(num+" is prime");
                             }
                             else{
                                     System.out.println(num+" is not a prime number");
                             }
                         }
                         
}
