import java.util.*;
public class Practise49 {
                         public static void main(String[]abc)
                         {
                           int num1=0,num2=1;
                           int num3;
                           Scanner sc=new Scanner(System.in);
                           System.out.println("Enter the terms of Fibonacci Series");
                           int terms=sc.nextInt();

                           System.out.println("Fibonacci Series from 1 to "+terms+" = ");
                           System.out.print(num1+" "+num2);
                           for(int i=2;i<=terms;i++)
                           {
                               num3=num1+num2;
                               System.out.print(" "+num3+" ");
                               num1=num2;
                               num2=num3;
                           }
                         }
                         
}
