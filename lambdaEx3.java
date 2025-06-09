interface abc3
{
                         int fun(int x,int y);
}

public class lambdaEx3 {

                         public static void main(String[] abc)
                         {
                               abc3 a=(int n,int m)->
                               {
                                                  return m*n;
                               };

                               System.out.println("multiplication of two numbers using functional interface of lambda expression = " +a.fun(10,20));
                         }
                         
}

//output= multiplication of two numbers using functional interface of lambda expression = 200
