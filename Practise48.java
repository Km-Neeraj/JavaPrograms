import java.util.*;
public class Practise48 {
                         public static void main(String[]abc)
                         {
                            int num;
                            int fact=1;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter Number to find Factorial");
                            num=sc.nextInt();
                            for(int i=1;i<=num;i++)
                            {
                                fact=fact*i;
                            }

                            System.out.println("Factorial of "+num+" = "+fact);
                         }
                         
}

/*   
Enter Number to find Factorial
5
Factorial of 5 = 120 */
