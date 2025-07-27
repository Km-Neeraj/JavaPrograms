//Check number is Palindrome or not
import java.util.*;
public class Practice3 {
                         public static void main(String[]abc)
                         {
                           int num;
                           System.out.println("Enter Three digit Number like 123");
                           Scanner sc=new Scanner(System.in);
                           num=sc.nextInt();
                           int temp,rem,rev=0;
                           temp=num;
                           while(temp!=0)
                           {
                              rem=temp%10;
                              rev=rev*10+rem;
                              temp=temp/10;
                           }
                           if(num==rev)
                           {
                             System.out.println(num+" is Palindrome Number ");
                           }
                           else{
                                 System.out.println(num+" is not Palindrome Number");
                           }

                         }
                         
}
/*   Enter Three digit Number like 123
     145
     145 is not Palindrome Number */
