interface abc2
{
                         void fun(int x,int y);
}

public class lambdaEx2 {
                         public static void main(String[]abc)
                         {
                              abc2 a1=(a,b)->
                              {
                                  System.out.println("sum of two numbers " + a +" , "+ b + " = " +(a+b)+" using lambda Expression");
                              };

                              a1.fun(10,21);
                         }

                         //output = sum of two numbers 10 , 21 = 31 using lambda Expression
                         
}
