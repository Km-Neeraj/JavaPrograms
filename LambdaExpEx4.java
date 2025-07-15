//create a program that takes an Integer input and uses a lambda expression to
//check if it's even or odd.print the result accordingly
interface evenOdd
{
                         void evenOdd(int num);
}
public class LambdaExpEx4 {
                         public static void main(String[]abc)
                         {
                            evenOdd ob=num->
                            {
                               if(num%2==0)
                               {
                                                  System.out.println(num+" is Even");
                               }
                               else{
                                                  System.out.println(num+" is Odd");
                               }                   
                            };
                            ob.evenOdd(12);
                         }
                         

}

//12 is Even
