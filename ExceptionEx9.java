//write a program that takes two numbers as input and performs division.Handle 
// the ArithmeticException if second number is Zero

import java.util.*;
public class ExceptionEx9 {
                         public static void main(String[]anc)
                         {
                                                  int res;
                             Scanner sc=new Scanner(System.in);
                             int num1,num2;
                             System.out.println("Enter Two Numbers");
                             num1=sc.nextInt();
                             num2=sc.nextInt();
                             try{
                                   res=num1/num2;
                                   System.out.println("Division of "+num1+" by "+num2+" = "+res);
                             }
                             catch(ArithmeticException e)
                             {
                                System.out.println("Number can't be divide by Zero");
                                System.out.println(e);
                             }
                         }

                         
}
/*Enter Two Numbers
45
0
Number can't be divide by Zero
java.lang.ArithmeticException: / by zero*/
