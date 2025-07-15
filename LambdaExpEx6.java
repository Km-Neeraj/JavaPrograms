//print Factorial of a number using Lambda Expression

interface Factorial 
{
      void fact(int x);
}
public class LambdaExpEx6 {
                         public static void main(String[]abc)
                         {
                            Factorial f=num->
                            {
                                                  int fact=1;
                                 for(int i=1;i<=num;i++)
                                 {
                                    fact=fact*i;               
                                 }
                                 System.out.println("Factorial Of "+num+" = "+fact);
                            };
                            f.fact(5);
                         }
                         
}

//Factorial Of 5 = 120
