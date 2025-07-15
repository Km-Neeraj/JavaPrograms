//WAP that accepts a number value input and uses a lambda expression to reverse it
//Print the reversed number

interface ReverseNum 
{
                         void reverseNum(int num);
}
public class LambdaExpEx5 {

                          
                         public static void main(String[]abc)
                         {
                                                 
                            ReverseNum ob=num->
                            {
                                                 int  temp=num;
                                                 int rem;
                                                  int res=0;
                                                  while(num!=0)
                                                  {
                                                     rem=num%10;
                                                     res=res*10+rem;
                                                     num=num/10;
                                                  }
                               System.out.println( "Reverse of "+temp+" = "+res);
                            };
                         
                         ob.reverseNum(123);
                         }
}

//Reverse of 123 = 321
