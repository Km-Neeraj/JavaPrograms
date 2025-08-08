
import java.util.*;
public class Practise52 {
                         public static void main(String[]abc)
                         {
                            int num;
                            int rem=0,rev=0;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter the number to check Palindrome or not");
                            num=sc.nextInt();
                            int temp=num;
                            while(num!=0)
                            {
                              rem=num%10;
                              rev=rev*10+rem;
                              num=num/10;
                            }
                            if(temp==rev)
                            {
                               System.out.println(temp+" Number is Palindrome");
                            }
                            else{
                                   System.out.println(temp+" Number is not Palindrome");
                            }
                         }
                         
}
